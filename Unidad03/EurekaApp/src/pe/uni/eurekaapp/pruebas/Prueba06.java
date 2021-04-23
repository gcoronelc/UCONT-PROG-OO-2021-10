package pe.uni.eurekaapp.pruebas;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLType;
import pe.uni.eurekaapp.db.AccesoDB;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba06 {
	
	public static void main(String[] args) {
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			String sql = "{call usp_sumar(?,?,?)}";
			CallableStatement cstm = cn.prepareCall(sql);
			cstm.setDouble(1, 45.78);
			cstm.setDouble(2, 56.23);
			cstm.registerOutParameter(3, java.sql.Types.DECIMAL);
			cstm.executeUpdate();
			double suma = cstm.getDouble(3);
			cstm.close();
			System.out.println("Suna: " + suma);
			System.out.println("Proceso ok.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		
	}

}
