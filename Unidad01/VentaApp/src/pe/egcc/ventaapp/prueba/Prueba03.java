package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.model.ItemModel;
import pe.egcc.ventaapp.service.BoletaService;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.FacturaService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba03 {
	
	public static void main(String[] args) {
		// Datos
		double total = 1180.0;
		// Proceso
		//CompAbstract service = new FacturaService();
		CompAbstract service = new BoletaService();
		ItemModel[] repo = service.procVenta(total);
		// Reporte
		for (ItemModel model : repo) {
			System.out.println(model.getConcepto() + " - " + model.getValor());
		}
	}

}
