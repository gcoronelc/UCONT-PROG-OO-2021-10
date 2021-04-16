package pe.ucont.smeapp.prueba;

import pe.ucont.smeapp.service.SMEService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba01 {

    public static void main(String[] args) {
       // Variables
		 double soles, dolares;
		 // Datos
		 soles = 50000;
		 // Proceso
		 SMEService service = new SMEService();
		 dolares = service.solesToDolares(soles);
		 // Reporte
		 System.out.println("Soles: " + soles);
		 System.out.println("Dolares: " + dolares);

    }

}
