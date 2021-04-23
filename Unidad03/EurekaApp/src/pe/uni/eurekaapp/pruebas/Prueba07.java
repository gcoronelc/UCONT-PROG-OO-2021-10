package pe.uni.eurekaapp.pruebas;

import java.sql.CallableStatement;
import java.sql.Connection;
import pe.uni.eurekaapp.db.AccesoDB;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba07 {
	
	public static void main(String[] args) {
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			String sql = "{call usp_egcc_saldo_cuenta(?,?)}";
			CallableStatement cstm = cn.prepareCall(sql);
			cstm.setString(1, "00100001");
			cstm.registerOutParameter(2, java.sql.Types.DECIMAL);
			cstm.executeUpdate();
			double suma = cstm.getDouble(2);
			cstm.close();
			System.out.println("Saldo: " + suma);
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
