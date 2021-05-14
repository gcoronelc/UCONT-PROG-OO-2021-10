package pe.edu.ucont.proyectodemoef.prueba;

import pe.edu.ucont.proyectodemoef.dto.EmpleadoDto;
import pe.edu.ucont.proyectodemoef.service.LogonService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba02 {

	public static void main(String[] args) {
		// Datos
		String usuario = "cromero";
		String clave = "chicho";
		// Proceso
		LogonService service = new LogonService();
		EmpleadoDto dto = service.validar(usuario, clave);
		// Reporte
		if( service.getCode() == 1 ){
			System.out.println("Hola " + dto.getNombre() );
		} else {
			System.err.println(service.getMessage());
		}
	}

}
