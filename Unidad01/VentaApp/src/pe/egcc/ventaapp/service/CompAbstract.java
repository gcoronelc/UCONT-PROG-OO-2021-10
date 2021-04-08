package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.model.ItemModel;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public abstract class CompAbstract {
	
	protected final double IGV = 0.18;
	protected final double SERVICIO = 0.10;
	
	public abstract ItemModel[] procVenta( double total );

}
