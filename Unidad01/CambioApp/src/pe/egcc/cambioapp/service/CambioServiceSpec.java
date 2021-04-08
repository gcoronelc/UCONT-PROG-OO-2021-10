package pe.egcc.cambioapp.service;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public interface CambioServiceSpec {
   
   Double DOLARRES_TO_SOLES = 3.50;
   Double EUROS_TO_SOLES = 4.50;

   Double calcularCambio(Double valor);
   
   
}
