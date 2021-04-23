package pe.uni.eurekaapp.pruebas;

import pe.uni.eurekaapp.controller.CuentaController;
import pe.uni.eurekaapp.service.CuentaService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba11 {
	
	public static void main(String[] args) {
		try {
			CuentaController controller = new CuentaController();
			controller.registrarDeposito("00100001", 1000);
			System.out.println("Proceso ok.");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
