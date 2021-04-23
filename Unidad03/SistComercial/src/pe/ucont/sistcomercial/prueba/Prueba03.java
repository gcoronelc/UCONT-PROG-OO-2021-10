package pe.ucont.sistcomercial.prueba;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import pe.ucont.sistcomercial.db.AccesoDB;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba03 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			Statement stm = cn.createStatement();
			String query = "select idcat, nombre from categoria";
			ResultSet rs = stm.executeQuery(query);
			while(rs.next()){
				int id = rs.getInt("idcat");
				String nombre = rs.getString("nombre");
				System.out.println(id + " - " + nombre);
			}
			rs.close();
			stm.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
	}

}
