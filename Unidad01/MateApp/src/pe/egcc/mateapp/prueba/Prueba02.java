package pe.egcc.mateapp.prueba;

import pe.egcc.mateapp.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    // Datos
    int n1 = 15;
    int n2 = 20;
    
    // Proceso
    int mcd = MateService.mcd(n1, n2);
    int mcm = MateService.mcm(n1, n2);
    
    // Reporte
    System.out.println("n1: " + n1);
    System.out.println("n2: " + n2);
    System.out.println("mcd: " + mcd);
    System.out.println("mcm: " + mcm);
  }

}
