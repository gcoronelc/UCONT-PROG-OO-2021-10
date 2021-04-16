package pe.egcc.cambioapp.prueba;

import pe.egcc.cambioapp.service.CambioServiceSpec;
import pe.egcc.cambioapp.service.impl.EurosToSoles;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba04 {
   public static void main(String[] args) {
      // Dato
      Double euros = 1000.0;
      // Proceso
      CambioServiceSpec service = new EurosToSoles();
      Double soles = service.calcularCambio(euros);
      // Reporte
      System.out.println("Euros: " + euros);
      System.out.println("Soles: " + soles);
   }
}
