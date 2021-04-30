package pe.edu.contontinental.appdemopa3.prueba;

import java.sql.Connection;
import pe.edu.contontinental.appdemopa3.db.AccesoDB;
import pe.edu.contontinental.appdemopa3.service.DemoService;

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
		  Long id = 1002L;
		  // Proceso
		  DemoService service = new DemoService();
		  Long stock = service.consultarStock(id);
		  int code = service.getCode();
		  String message = service.getMessage();
		  // Reporte
		  if( code == 1 ){
			  System.out.println("Stock: " + stock);
		  } else {
			  System.err.println(message);
		  }
    }

}
