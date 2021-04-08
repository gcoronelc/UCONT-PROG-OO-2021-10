package pe.egcc.mateapp.prueba;

import pe.egcc.mateapp.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba04 {

  public static void main(String[] args) {
    // Datos
    int n1 = 49;
    int n2 = 57;
    
    // Proceso
    boolean rpta1 = MateService.esPrimo(n1);
    boolean rpta2 = MateService.esPrimo(n2);
    
    // Reporte
    System.out.println(n1 + " es primo? " + rpta1);
    System.out.println(n2 + " es primo? " + rpta2);
  }
}
