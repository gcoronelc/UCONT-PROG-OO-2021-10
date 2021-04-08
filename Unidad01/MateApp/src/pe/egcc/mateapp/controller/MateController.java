package pe.egcc.mateapp.controller;

import pe.egcc.mateapp.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class MateController {

  public long factorial(int n) {
    return MateService.factorial(n);
  }

  public int mcd(int n1, int n2) {
    return MateService.mcd(n1, n2);
  }

  public int mcm(int n1, int n2) {
    return MateService.mcm(n1, n2);
  }

  public int[] fibonacci(int num) {
    return MateService.fibonacci(num);
  }

  public boolean esPrimo(int num) {
    return MateService.esPrimo(num);
  }

}
