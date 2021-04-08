package pe.egcc.mateapp.prueba;

import pe.egcc.mateapp.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    // Datos
    int n = 0;
    
    // Proceso
    long f = MateService.factorial(n);
    
    // Reporte
    System.out.println("n = " + n);
    System.out.println("f = " + f);
  }

}
