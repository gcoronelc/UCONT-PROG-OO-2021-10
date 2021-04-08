package pe.edu.uni.apppedido.prueba;

import pe.edu.uni.apppedido.service.PedidoService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba01 {

	public static void main(String[] args) {
		// Variables
		double importe, impuesto, total;
		// Datos
		importe = 1000;
		// Proceso
		PedidoService service = new PedidoService();
		impuesto = service.calcImpuesto(importe);
		total = service.calcTotal(importe);
		// Reporte
		System.out.println("Importe: " + importe);
		System.out.println("Impuesto: " + impuesto);
		System.out.println("Total: " + total);
	}
	
	
}
