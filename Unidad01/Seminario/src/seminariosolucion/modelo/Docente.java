package seminariosolucion.modelo;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public abstract class Docente extends Personal{

	private String grado;
	private boolean investiga;

	public Docente() {
	}

	public Docente(String grado, boolean investiga, int codigo, String nombre, String apellido, String dni, String correo, String teléfono, double sueldoBase, double sueldoExtra, double sueldoNeto) {
		super(codigo, nombre, apellido, dni, correo, teléfono, sueldoBase, sueldoExtra, sueldoNeto);
		this.grado = grado;
		this.investiga = investiga;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}
	
}
