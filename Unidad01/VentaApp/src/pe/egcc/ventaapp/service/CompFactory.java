package pe.egcc.ventaapp.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class CompFactory {
	
	public static final String BOLETA = "Boleta";
	public static final String FACTURA = "Factura";
	
	private CompFactory() {
	}

	public static String[] getTipos(){
		String[] tipos = {FACTURA, BOLETA};
		return tipos;
	}
	
	public static CompAbstract getComp( String tipo ){
		CompAbstract service = null;
		switch( tipo ){
			case BOLETA: 
				service = new BoletaService();
				break;
			case FACTURA: 
				service = new FacturaService();
				break;	  
		}
		return service;
	}
	
}
