package pe.uni.eurekaapp.pruebas;

import java.sql.Connection;
import java.sql.Statement;
import pe.uni.eurekaapp.db.AccesoDB;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba02 {
	
	public static void main(String[] args) {
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			Statement stm = cn.createStatement();
			cn.setAutoCommit(false); // Inicio de Tx
			stm.execute("insert into eureka.moneda(chr_monecodigo,vch_monedescripcion) values( '80', 'EL INTI' )");
			//stm.execute("insert into moneda(chr_monecodigo,vch_monedescripcion) values( '79', 'EL INTI' )");
			stm.close();
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
