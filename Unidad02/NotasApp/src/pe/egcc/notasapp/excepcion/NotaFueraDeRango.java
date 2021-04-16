package pe.egcc.notasapp.excepcion;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class NotaFueraDeRango extends Exception{

   public NotaFueraDeRango() {
      this("ERROR: La nota debe estar en el rango [0,20].");
   }

   public NotaFueraDeRango(String message) {
      super(message);
   }

   
   
}
