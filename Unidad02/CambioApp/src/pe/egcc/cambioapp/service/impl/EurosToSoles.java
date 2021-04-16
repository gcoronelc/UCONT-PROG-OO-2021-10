package pe.egcc.cambioapp.service.impl;

import pe.egcc.cambioapp.service.CambioServiceSpec;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class EurosToSoles implements CambioServiceSpec{

   @Override
   public Double calcularCambio(Double valor) {
      Double cambio;
      cambio = valor * EUROS_TO_SOLES;
      return cambio;
   }

}
