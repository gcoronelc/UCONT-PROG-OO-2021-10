package pe.uni.eurekaapp.pruebas;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import pe.uni.eurekaapp.db.AccesoDB;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba09 {
	
	public static void main(String[] args) {
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			Statement stm = cn.createStatement();
			stm.execute("insert into eureka.moneda(chr_monecodigo,vch_monedescripcion) values( '61', 'MONEDA 61' )");
			cn.setAutoCommit(false); // Inicio de Tx
			stm.execute("insert into eureka.moneda(chr_monecodigo,vch_monedescripcion) values( '62', 'MONEDA 62' )");
			stm.close();
			if( true )
				throw new SQLException("Chau, no pasa nada");
			cn.commit(); // Confirma la Tx
			System.out.println("Proceso ok.");
		} catch (Exception e) {
			e.printStackTrace();
			try {
				cn.rollback(); // Cancela la Tx
			} catch (Exception e1) {
			}
		} finally{
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		
	}

}
