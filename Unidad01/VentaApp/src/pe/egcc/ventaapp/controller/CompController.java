package pe.egcc.ventaapp.controller;

import pe.egcc.ventaapp.model.ItemModel;
import pe.egcc.ventaapp.service.CompFactory;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class CompController {

	public String[] traerTipos() {
		return CompFactory.getTipos();
	}

	public ItemModel[] procVenta(String tipo, double total) {
		return CompFactory.getComp(tipo).procVenta(total);
	}

}
