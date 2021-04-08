package pe.edutec.promedioapp.controller;

import pe.edutec.app.lib.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class AppController {
  
  private MateService mateService;

  public AppController() {
    mateService = new MateService();
  }

  public int promediar(int num1, int num2) {
    return mateService.promediar(num1, num2);
  }

  public int promediar(int num1, int num2, int num3) {
    return mateService.promediar(num1, num2, num3);
  }

  public int promediar(int num1, int num2, int num3, int num4) {
    return mateService.promediar(num1, num2, num3, num4);
  }

  public int promediar(int num1, int num2, int num3, int num4, int num5) {
    return mateService.promediar(num1, num2, num3, num4, num5);
  }

}
