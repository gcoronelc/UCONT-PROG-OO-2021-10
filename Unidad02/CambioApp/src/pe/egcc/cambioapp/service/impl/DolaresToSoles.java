package pe.egcc.cambioapp.service.impl;

import pe.egcc.cambioapp.service.CambioServiceSpec;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class DolaresToSoles implements CambioServiceSpec{

   @Override
   public Double calcularCambio(Double valor) {
      Double cambio;
      cambio = valor * DOLARRES_TO_SOLES;
      return cambio;
   }

}
