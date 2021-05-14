package pe.edu.ucont.proyectodemoef.prueba;

import pe.edu.ucont.proyectodemoef.dto.EmpleadoDto;
import pe.edu.ucont.proyectodemoef.service.CuentaService;
import pe.edu.ucont.proyectodemoef.service.LogonService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba03 {

	public static void main(String[] args) {
		// Datos
		String cuenta = "00100001";
		String clave = "123456";
		double importe = 1000.0;
		String codEmp = "0005";
		// Proceso
		CuentaService service = new CuentaService();
		double saldo = service.procesoRetiro(cuenta, importe, clave, codEmp);
		// Reporte
		if( service.getCode() == 1 ){
			System.out.println("Nuevo saldo " + saldo );
		} else {
			System.err.println(service.getMessage());
		}
	}

}
