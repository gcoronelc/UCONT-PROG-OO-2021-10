package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.model.ItemModel;
import pe.egcc.ventaapp.service.BoletaService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba02 {
	
	public static void main(String[] args) {
		// Datos
		double total = 1180.0;
		// Proceso
		BoletaService service = new BoletaService();
		ItemModel[] repo = service.procVenta(total);
		// Reporte
		for (ItemModel model : repo) {
			System.out.println(model.getConcepto() + " - " + model.getValor());
		}
	}

}
