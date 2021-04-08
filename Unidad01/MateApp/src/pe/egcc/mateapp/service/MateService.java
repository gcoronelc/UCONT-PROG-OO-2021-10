package pe.egcc.mateapp.service;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class MateService {

  private MateService() {
  }
  
  public static long factorial(int n){
    long f = 1;
    // Inicio Proceso
    while( n > 1){
      f *= n--;
    }
    // Fin Proceso
    return f;
  }
  
  public static int mcd(int n1, int n2){
    // Inicio Proceso
    while( n1 != n2 ){
      if( n1 > n2 ){
        n1 -= n2;
      } else {
        n2 -= n1;
      }
    }
    // Fin Proceso
    return n1;
  }
  
  public static int mcm(int n1, int n2){
    int valor;
    // Inicio Proceso
    valor = n1 * n2 / mcd(n1,n2);
    // Fin Proceso
    return valor;
  }
  
  public static int[] fibonacci(int n){
    int[] serie = new int[n];
    // Inicio Proceso
    serie[0] = 0;
    serie[1] = 1;
    for(int i = 2; i < n; i++){
      serie[i] = serie[i-1] + serie[i-2];
    }
    // Fin Proceso
    return serie;
  }
  
  public static boolean esPrimo(int n){
    boolean primo = true;
    // Inicio Proceso
    for(int i = 2; i < n; i++){
      if( (n % i) == 0 ){
        primo = false;
        break;
      }
    }
    // Fin Proceso
    return primo;
  }
  
}
