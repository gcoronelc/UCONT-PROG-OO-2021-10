package pe.uni.eurekaapp.pruebas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pe.uni.eurekaapp.db.AccesoDB;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba05 {
	
	public static void main(String[] args) {
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			String sql = "select * from eureka.moneda where upper(vch_monedescripcion) like ?";
			PreparedStatement pstm = cn.prepareStatement(sql);
			pstm.setString(1, "%SOLES%");
			ResultSet rs = pstm.executeQuery();
			while( rs.next() ){
				String codigo = rs.getString("chr_monecodigo");
				String descripcion = rs.getString("vch_monedescripcion");
				System.out.println(codigo + " - " + descripcion);
			}
			rs.close();
			pstm.close();
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
