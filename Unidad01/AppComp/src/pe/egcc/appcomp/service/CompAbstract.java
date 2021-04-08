package pe.egcc.appcomp.service;

import pe.egcc.appcomp.model.Item;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public abstract class CompAbstract {

   public static final double IGV = 0.19;
   public static final double SERVICIO = 0.10;
   
   public abstract Item[] procesar( Double total);
   
   public Double redondear( Double valor){
      valor *= 100;
      valor = Math.round(valor) * 1.0;
      valor /= 100;
      return valor;
   }
}
