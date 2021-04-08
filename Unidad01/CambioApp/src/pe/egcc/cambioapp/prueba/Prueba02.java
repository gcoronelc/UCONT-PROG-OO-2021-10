package pe.egcc.cambioapp.prueba;

import pe.egcc.cambioapp.service.CambioServiceSpec;
import pe.egcc.cambioapp.service.impl.DolaresToSoles;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba02 {

   public static void main(String[] args) {
      // Dato
      Double dolares = 1000.0;
      // Proceso
      CambioServiceSpec service = new DolaresToSoles();
      Double soles = service.calcularCambio(dolares);
      // Reporte
      System.out.println("Dolares: " + dolares);
      System.out.println("Soles: " + soles);
   }
}
