package pe.egcc.appcomp.controller;

import pe.egcc.appcomp.model.Item;
import pe.egcc.appcomp.service.CompAbstract;
import pe.egcc.appcomp.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class CompController {

   public String[] obtenerTipos() {
      return CompFactory.obtenerTipos();
   }

   public Item[] procesar(String tipo, Double total) {
      CompAbstract service;
      service = CompFactory.obtenerComp(tipo);
      return service.procesar(total);
   }

}
