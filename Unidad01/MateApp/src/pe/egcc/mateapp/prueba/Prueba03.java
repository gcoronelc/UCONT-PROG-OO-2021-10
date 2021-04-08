package pe.egcc.mateapp.prueba;

import pe.egcc.mateapp.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba03 {
  
  public static void main(String[] args) {
    // Dato
    int n = 7;
    
    // Proceso
    int[] serie = MateService.fibonacci(n);
    
    // Reporte
    System.out.println("n = " + n);
    System.out.print("Serie = ");
    for (int ele : serie) {
      System.out.print(ele + "\t");
    }
  }

}
