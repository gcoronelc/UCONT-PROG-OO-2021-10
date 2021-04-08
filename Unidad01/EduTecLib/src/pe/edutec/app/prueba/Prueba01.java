package pe.edutec.app.prueba;

import pe.edutec.app.lib.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    
    // Datos
    int n1 = 15;
    int n2 = 17;
    int n3 = 16;
    int n4 = 18;
    int n5 = 10;
    
    // Proceso
    MateService mateService = new MateService();
    int pr2 = mateService.promediar(n1, n2);
    int pr3 = mateService.promediar(n1, n2, n3);
    int pr4 = mateService.promediar(n1, n2, n3, n4);
    int pr5 = mateService.promediar(n1, n2, n3, n4, n5);
    
    // Reporte
    System.out.println("pr2: " + pr2);
    System.out.println("pr3: " + pr3);
    System.out.println("pr4: " + pr4);
    System.out.println("pr5: " + pr5);
    
  }

}
