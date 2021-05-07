package pe.uni.eurekaapp.pruebas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import pe.uni.eurekaapp.db.AccesoDB;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba04 {
	
	public static void main(String[] args) {
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			Statement stm = cn.createStatement();
			String sql = "select * from eureka.moneda";
			ResultSet rs = stm.executeQuery(sql);
			while( rs.next() ){
				String codigo = rs.getString("chr_monecodigo");
				String descripcion = rs.getString("vch_monedescripcion");
				System.out.println(codigo + " - " + descripcion);
			}
			rs.close();
			stm.close();
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
