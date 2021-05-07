package pe.edu.ucont.proyectodemoef.prueba;

import java.sql.Connection;
import pe.edu.ucont.proyectodemoef.db.AccesoDB;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba01 {

	public static void main(String[] args) {
		try {
			Connection cn = AccesoDB.getConnection();
			System.out.println("Ok");
			cn.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
