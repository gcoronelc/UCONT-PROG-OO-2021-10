package pe.egcc.appcomp.service;

import pe.egcc.appcomp.model.Item;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class FacturaService extends CompAbstract{

   @Override
   public Item[] procesar(Double total) {
      // Datos deben calcular
      Double consumo, impuesto, servicio, totalGeneral;
      // Proceso
      total = redondear(total);
      consumo = redondear(total / (1 + IGV));
      impuesto = redondear(total - consumo);
      servicio = redondear(total * SERVICIO);
      totalGeneral = redondear(total + servicio);
      // Reporte
      Item[] repo = {
         new Item("Consumo", consumo),
         new Item("Impuesto", impuesto),
         new Item("Total", total),
         new Item("Servicio", servicio),
         new Item("Total General", totalGeneral)
      };
      return repo;
   }

}
