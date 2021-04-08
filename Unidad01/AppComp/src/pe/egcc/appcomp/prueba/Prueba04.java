package pe.egcc.appcomp.prueba;

import pe.egcc.appcomp.model.Item;
import pe.egcc.appcomp.service.CompAbstract;
import pe.egcc.appcomp.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba04 {

   public static void main(String[] args) {
      // Dato
      Double total = 119.0;
      // Proceso
      CompAbstract service;
      service = CompFactory.obtenerComp(CompFactory.COMP_BOLETA);
      Item[] repo = service.procesar(total);
      // Reporte
      for (Item item : repo) {
         System.out.println(item.getConcepto() + " -> " + item.getImporte());
      }
   }
   
   
   
}
