package seminariosolucion.prueba;

import seminariosolucion.modelo.Administrativo;
import seminariosolucion.modelo.Universidad;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba01 {
	
	public static void main(String[] args) {
		
		Administrativo adm1 = new Administrativo();
		adm1.setNombre("Pedro");
		
		Administrativo adm2 = new Administrativo();
		adm2.setNombre("Laura");
		
		Administrativo adm3 = new Administrativo();
		adm3.setNombre("Manuel");
		
		Universidad uni = new Universidad();
		uni.registrarAdministrativo(adm1);
		uni.registrarAdministrativo(adm2);
		uni.registrarAdministrativo(adm3);
		
		uni.listarPersonalAdministrativo();
		
	}

}
