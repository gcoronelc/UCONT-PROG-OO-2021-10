package pe.uni.eurekaapp.pruebas;

import pe.uni.eurekaapp.service.CuentaService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba10 {
	
	public static void main(String[] args) {
		try {
			CuentaService service = new CuentaService();
			service.registrarDeposito("00100001", 1000, "0003");
			System.out.println("Proceso ok.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
		
	}

}
