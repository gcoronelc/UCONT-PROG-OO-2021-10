package pe.ucont.sistcomercial.prueba;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import pe.ucont.sistcomercial.db.AccesoDB;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba02 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			DatabaseMetaData dbmd = cn.getMetaData();
			String dbms = dbmd.getDatabaseProductName();
			String version = dbmd.getDatabaseProductVersion();
			System.out.println("Database : " + dbms);
			System.out.println("Version : " + version);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally{
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
	}

}
