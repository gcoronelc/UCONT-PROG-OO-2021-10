package pe.uni.eurekaapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pe.uni.eurekaapp.db.AccesoDB;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class CuentaService {

	/**
	 * Registrar deposito
	 *
	 * @param cuenta Cuenta del cliente
	 * @param importe Importe a depositar, debe ser mayor a cero.
	 * @param empleado Codigo del empleado que registra el depósito
	 */
	public void registrarDeposito(String cuenta, double importe, String empleado) {
		Connection cn = null;
		String sql = "";
		PreparedStatement pstm;
		ResultSet rs = null;
		double saldo = 0;
		int cont = 0;
		try {
			cn = AccesoDB.getConnection();
			cn.setAutoCommit(false);
			// Validar el importe
			if (importe <= 0.0) {
				throw new Exception("Importe debe ser positivo, mayor a 0.0.");
			}
			// Validar el empleado
			sql = "select count(1) cont from empleado where chr_emplcodigo = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, empleado);
			rs = pstm.executeQuery();
			rs.next();
			cont = rs.getInt(1);
			rs.close();
			pstm.close();
			if (cont == 0) {
				throw new Exception("Empleado no existe.");
			}
			// Datos de cuenta
			sql = "select dec_cuensaldo, int_cuencontmov from cuenta where chr_cuencodigo = ? for update";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, cuenta);
			rs = pstm.executeQuery();
			if (!rs.next()) {
				throw new Exception("Cuenta no existe.");
			}
			saldo = rs.getDouble("dec_cuensaldo");
			cont = rs.getInt("int_cuencontmov");
			rs.close();
			pstm.close();
			// Actualizar la cuenta
			saldo += importe;
			cont++;
			sql = "update cuenta set dec_cuensaldo=?, int_cuencontmov=? where chr_cuencodigo = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setDouble(1, saldo);
			pstm.setInt(2, cont);
			pstm.setString(3, cuenta);
			pstm.executeUpdate();
			pstm.close();
			// Registrar movimiento
			sql = "insert into movimiento(chr_cuencodigo,int_movinumero,dtt_movifecha,"
					  + "chr_emplcodigo,chr_tipocodigo,dec_moviimporte) values(?,?,sysdate,?,'003',?)";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, cuenta);
			pstm.setInt(2, cont);
			pstm.setString(3, empleado);
			pstm.setDouble(4, importe);
			pstm.executeUpdate();
			pstm.close();
			cn.commit();
		} catch (Exception e) {
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
			throw new RuntimeException("Error en el proceso. " + e.getMessage());
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}

	}

	public List<Map<String, ?>> getMovimientos(String cuenta) {
		List<Map<String, ?>> lista = new ArrayList<>();
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			String sql = "select cuencodigo, monenombre, cuensaldo, cuenestado, "
					  + "movinumero, movifecha, moviimporte, tipocodigo, tiponombre "
					  + "from EUREKA.v_movimientos where cuencodigo = ?";
			PreparedStatement pstm = cn.prepareStatement(sql);
			pstm.setString(1, cuenta);
			ResultSet rs = pstm.executeQuery();
			lista = JdbcUtil.rsToList(rs);
			rs.close();
			pstm.close();
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return lista;
	}
	
	
}
