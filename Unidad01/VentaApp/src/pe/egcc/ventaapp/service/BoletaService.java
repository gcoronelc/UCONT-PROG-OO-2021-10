package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.model.ItemModel;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class BoletaService extends CompAbstract {

	@Override
	public ItemModel[] procVenta(double total) {
		// Variables
		double servicio, totalGeneral;
		// Proceso
		servicio = total * SERVICIO;
		totalGeneral = total + servicio;
		// Reporte
		ItemModel[] repo = {
			new ItemModel("Total", total),
			new ItemModel("Servicio", servicio),
			new ItemModel("Total General", totalGeneral)
		};
		return repo;
	}

}
