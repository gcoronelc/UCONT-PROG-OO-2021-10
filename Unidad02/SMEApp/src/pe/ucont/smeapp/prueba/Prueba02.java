package pe.ucont.smeapp.prueba;

import pe.ucont.smeapp.service.SMEService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba02 {

    public static void main(String[] args) {
       // Variables
		 double soles, dolares;
		 // Datos
		 dolares = 50000;
		 // Proceso
		 SMEService service = new SMEService();
		 soles = service.dolaresToSoles(dolares);
		 // Reporte
		 System.out.println("Dolares: " + dolares);
		 System.out.println("Soles: " + soles);
    }

}
