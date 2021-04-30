package pe.edu.contontinental.appdemopa3.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class AccesoDB {

	private AccesoDB() {
	}

	public static Connection getConnection() throws SQLException {
		Connection cn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver").newInstance();
			String url = "jdbc:oracle:thin:@192.168.1.2:1521/XE";
			cn = DriverManager.getConnection(url, "ventas", "admin");
		} catch (ClassNotFoundException e) {
			throw new SQLException("No se encuentra el driver.");
		} catch (SQLException e) {
			throw e;
		} catch (Exception e) {
			throw new SQLException("Se ha presentado errores en la base de datos.");
		}
		return cn;
	}

}
