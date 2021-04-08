package pe.egcc.cambioapp.prueba;

import pe.egcc.cambioapp.service.CambioServiceSpec;
import pe.egcc.cambioapp.service.impl.SolesToDolares;
import pe.egcc.cambioapp.service.impl.SolesToEuros;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba03 {

   public static void main(String[] args) {
      // Dato
      Double soles = 1000.0;
      // Proceso
      CambioServiceSpec service = new SolesToEuros();
      Double euros = service.calcularCambio(soles);
      // Reporte
      System.out.println("Soles: " + soles);
      System.out.println("Euros: " + euros);
   }
   
}
