package pe.uni.eurekaapp.pruebas;

import pe.uni.eurekaapp.model.EmpleadoModel;
import pe.uni.eurekaapp.service.LogonService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba12 {
	
	public static void main(String[] args) {
		try {
			// Datos
			String usuario = "cromero";
			String clave = "chicho";
			// Proceso
			LogonService service = new LogonService();
			EmpleadoModel model = service.validar(usuario, clave);
			// Reporte
			System.out.println("Hola " + model.getNombre());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
		
	}

}
