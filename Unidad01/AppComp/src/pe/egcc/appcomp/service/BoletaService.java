package pe.egcc.appcomp.service;

import pe.egcc.appcomp.model.Item;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class BoletaService extends CompAbstract {

   @Override
   public Item[] procesar(Double total) {
      // Datos deben calcular
      Double servicio, totalGeneral;
      // Proceso
      total = redondear(total);
      servicio = redondear(total * SERVICIO);
      totalGeneral = redondear(total + servicio);
      // Reporte
      Item[] repo = {
         new Item("Total", total),
         new Item("Servicio", servicio),
         new Item("Total General", totalGeneral)
      };
      return repo;
   }

}
