package pe.edutec.app.lib;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class MateService {
  
  public int promediar(int n1, int n2){
    int pr;
    pr = (n1 + n2) / 2;
    return pr;
  }
  
  public int promediar(int n1, int n2, int n3){
    int pr;
    pr = (n1 + n2 + n3) / 3;
    return pr;
  }
  
  public int promediar(int n1, int n2, int n3, int n4){
    int pr;
    pr = (n1 + n2 + n3 + n4) / 4;
    return pr;
  }
  
  public int promediar(int n1, int n2, int n3, int n4, int n5){
    int pr;
    pr = (n1 + n2 + n3 + n4 + n5) / 5;
    return pr;
  }
  
}
