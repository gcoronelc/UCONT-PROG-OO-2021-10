package pe.egcc.cambioapp.prueba;

import pe.egcc.cambioapp.service.CambioFactory;
import pe.egcc.cambioapp.service.CambioServiceSpec;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba05 {

   public static void main(String[] args) {
      // Dato
      Double soles = 1000.0;
      // Proceso
      CambioServiceSpec service;
      service = CambioFactory.getComponente(CambioFactory.SOLES_TO_DOLARES);
      Double dolares = service.calcularCambio(soles);
      // Reporte
      System.out.println("Soles: " + soles);
      System.out.println("Dolares: " + dolares);
   }
   
}
