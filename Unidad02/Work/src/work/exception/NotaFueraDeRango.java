package work.exception;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class NotaFueraDeRango extends Exception {

	public NotaFueraDeRango() {
		super("Error: Nota debe estar en el rango de [0,20].");
	}

	public NotaFueraDeRango(String msg) {
		super(msg);
	}
	
}
