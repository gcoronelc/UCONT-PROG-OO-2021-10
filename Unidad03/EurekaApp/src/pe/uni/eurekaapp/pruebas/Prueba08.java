package pe.uni.eurekaapp.pruebas;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;
import pe.uni.eurekaapp.db.AccesoDB;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba08 {
	
	public static void main(String[] args) {
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			String sql = "{call usp_egcc_movimientos(?,?)}";
			CallableStatement cstm = cn.prepareCall(sql);
			cstm.setString(1, "00100001");
			cstm.registerOutParameter(2, OracleTypes.CURSOR);
			cstm.executeUpdate();
			ResultSet rs = (ResultSet) cstm.getObject(2);
			while(rs.next()){
				System.out.println(rs.getString("cuenta") + " - " + rs.getString("descripcion") + " - " + rs.getDouble("importe") );
			}
			rs.close();
			cstm.close();
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
