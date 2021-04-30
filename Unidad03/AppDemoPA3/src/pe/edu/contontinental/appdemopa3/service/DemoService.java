package pe.edu.contontinental.appdemopa3.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.edu.contontinental.appdemopa3.db.AccesoDB;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class DemoService {
	
	private int code;
	private String message;

	public DemoService() {
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Long consultarStock(Long id){
		Long stock = 0L;
		Connection cn = null;
		this.code = 1; // ok
		this.message = "";
		try {
			cn = AccesoDB.getConnection();
			String query = "select stock from producto where idprod = ?";
			PreparedStatement pstm = cn.prepareStatement(query);
			pstm.setLong(1, id);
			ResultSet rs = pstm.executeQuery();
			if(!rs.next()){
				throw new SQLException("Código no existe.");
			}
			stock = rs.getLong("STOCK");
			rs.close();
			pstm.close();
		} catch (SQLException e) {
			this.code = -1;
			this.message = e.getMessage();
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return stock;
	}

	public Long actualizarStock(Long id, Long incremento){
		// Validar
		if(incremento <= 0){
			this.code = -1;
			this.message = "El incremento debe ser positivo.";
			return 0L;
		}
		Long stock = 0L;
		Connection cn = null;
		String query = "";
		this.code = 1; // ok
		this.message = "";
		try {
			// Conexión
			cn = AccesoDB.getConnection();
			cn.setAutoCommit(false); // Inicia la Tx
			// Actualiza el stock
			query = "update producto set stock = stock + ? where idprod = ?";
			PreparedStatement pstm = cn.prepareStatement(query);
			pstm.setLong(1, incremento);
			pstm.setLong(2, id);
			int filas = pstm.executeUpdate();
			if(filas == 0){
				throw new SQLException("Código no existe.");
			}
			pstm.close();
			// Lee el nuevo stock
			query = "select stock from producto where idprod = ?";
			pstm = cn.prepareStatement(query);
			pstm.setLong(1, id);
			ResultSet rs = pstm.executeQuery();
			rs.next();
			stock = rs.getLong("STOCK");
			rs.close();
			pstm.close();
			// Confirmar Tx
			cn.commit();
		} catch (SQLException e) {
			this.code = -1;
			this.message = e.getMessage();
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
		return stock;
	}

}
