package pe.edu.ucont.proyectodemoef.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.edu.ucont.proyectodemoef.db.AccesoDB;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class CuentaService extends AbstractService {

	public double procesoRetiro(String cuenta, double importe, String clave, String codEmp) {
		double saldo = 0.0;
		int contMov = 0;
		int filas = 0;
		String query = "";
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		// Estado por defecto
		this.setCode(1);
		this.setMessage("Proceso correcto.");
		try {
			// Acceso DB
			cn = AccesoDB.getConnection();
			cn.setAutoCommit(false); // Inicio de la Tx
			// Leer datos de la cuenta
			query = "select DEC_CUENSALDO, INT_CUENCONTMOV from cuenta "
					  + "where CHR_CUENCODIGO = ? and CHR_CUENCLAVE = ? for update";
			pstm = cn.prepareStatement(query);
			pstm.setString(1, cuenta);
			pstm.setString(2, clave);
			rs = pstm.executeQuery();
			if (!rs.next()) {
				throw new SQLException("Datos de cuenta incorrectos.");
			}
			saldo = rs.getDouble("DEC_CUENSALDO");
			contMov = rs.getInt("INT_CUENCONTMOV");
			rs.close();
			pstm.close();
			// Validar el saldo
			saldo -= importe;
			if (saldo < 0.0) {
				throw new SQLException("No tiene saldo suficiente.");
			}
			// Actualizar la cuenta
			contMov++;
			query = "update cuenta "
					  + "set DEC_CUENSALDO = ?, INT_CUENCONTMOV = ? "
					  + "where CHR_CUENCODIGO = ?";
			pstm = cn.prepareStatement(query);
			pstm.setDouble(1, saldo);
			pstm.setInt(2, contMov);
			pstm.setString(3, cuenta);
			filas = pstm.executeUpdate();
			if (filas != 1) {
				throw new SQLException("Error en la actualización de la cuenta.");
			}
			pstm.close();
			// Registrar movimiento
			query = "insert into movimiento(CHR_CUENCODIGO,INT_MOVINUMERO,"
					  + "DTT_MOVIFECHA,CHR_EMPLCODIGO,CHR_TIPOCODIGO,DEC_MOVIIMPORTE) "
					  + "values(?,?,SYSDATE,?,'004',?)";
			pstm = cn.prepareStatement(query);
			pstm.setString(1, cuenta);
			pstm.setInt(2, contMov);
			pstm.setString(3, codEmp);
			pstm.setDouble(4, importe);
			pstm.executeUpdate();
			pstm.close();
			// Finalizar Tx
			cn.commit();
		} catch (SQLException e) {
			this.setCode(-1);
			this.setMessage(e.getMessage());
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
		} catch (Exception e) {
			this.setCode(-1);
			this.setMessage("Error en el proceso, intentar de nuevo.");
			try {
				cn.rollback();
			} catch (Exception e1) {
			}			
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return saldo;
	}

}
