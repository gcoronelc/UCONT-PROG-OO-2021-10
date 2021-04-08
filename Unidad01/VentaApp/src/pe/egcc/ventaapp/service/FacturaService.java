package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.model.ItemModel;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class FacturaService extends CompAbstract{

	@Override
	public ItemModel[] procVenta(double total) {
		// Variables
		double consumo, impuesto, servicio, totalGeneral;
		// Proceso
		consumo = total / ( 1 + IGV );
		impuesto = total - consumo;
		servicio = total * SERVICIO;
		totalGeneral = total + servicio;
		// Reporte
		ItemModel[] repo = {
			new ItemModel("Consumo", consumo),
			new ItemModel("Impuesto", impuesto),
			new ItemModel("Total", total),
			new ItemModel("Servicio", servicio),
			new ItemModel("Total General", totalGeneral)
		};
		return repo;
	}

}
