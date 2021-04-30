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
public class Prueba03 {

    public static void main(String[] args) {
        // Datos
		  Long id = 1001L;
		  Long incremento = -10L;
		  // Proceso
		  DemoService service = new DemoService();
		  Long stock = service.actualizarStock(id, incremento);
		  int code = service.getCode();
		  String message = service.getMessage();
		  // Reporte
		  if( code == 1 ){
			  System.out.println("Nuevo stock: " + stock);
		  } else {
			  System.err.println(message);
		  }
    }

}
