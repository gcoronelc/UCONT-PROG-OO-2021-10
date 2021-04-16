package pe.egcc.cambioapp.controller;

import pe.egcc.cambioapp.service.CambioFactory;
import pe.egcc.cambioapp.service.CambioServiceSpec;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class CambioController {
   
   public String[] getTipos(){
      String[] tipos = {
         CambioFactory.SOLES_TO_DOLARES,
         CambioFactory.DOLARES_TO_SOLES,
         CambioFactory.SOLES_TO_EUROS,
         CambioFactory.EUROS_TO_SOLES,
      };
      return tipos;
   }
   
   public Double procesarCambio( String tipo, Double valor){
      CambioServiceSpec comp;
      comp = CambioFactory.getComponente(tipo);
      Double cambio = comp.calcularCambio(valor);
      return cambio;
   }

}
