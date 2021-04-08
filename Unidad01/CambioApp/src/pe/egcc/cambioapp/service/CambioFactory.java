package pe.egcc.cambioapp.service;

import pe.egcc.cambioapp.service.impl.DolaresToSoles;
import pe.egcc.cambioapp.service.impl.EurosToSoles;
import pe.egcc.cambioapp.service.impl.SolesToDolares;
import pe.egcc.cambioapp.service.impl.SolesToEuros;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class CambioFactory {
   
   public static final String SOLES_TO_DOLARES = "SOLES -> DOLARES";
   public static final String DOLARES_TO_SOLES = "DOLARES -> SOLES";
   public static final String SOLES_TO_EUROS = "SOLES -> EUROS";
   public static final String EUROS_TO_SOLES = "EUROS -> SOLES";

   private CambioFactory() {
   }
   
   public static CambioServiceSpec getComponente(String tipo){
      CambioServiceSpec comp = null;
      switch(tipo){
         case SOLES_TO_DOLARES:
            comp = new SolesToDolares();
            break;
         case DOLARES_TO_SOLES:
            comp = new DolaresToSoles();
            break;
         case SOLES_TO_EUROS:
            comp = new SolesToEuros();
            break;
         case EUROS_TO_SOLES:
            comp = new EurosToSoles();
            break;
      }
      return comp;
   }

}
