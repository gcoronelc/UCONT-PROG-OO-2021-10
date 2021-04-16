package work.exception;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class DatoIncorrecto extends Exception {

	public DatoIncorrecto() {
		super("Error: Dato incorrecto.");
	}

	public DatoIncorrecto(String msg) {
		super(msg);
	}
	
}
