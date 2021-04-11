package seminariosolucion.modelo;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Administrativo extends Personal{
	
	private String cargo;
	private int horasExtras;

	public Administrativo() {
	}

	public Administrativo(String cargo, int horasExtras, int codigo, String nombre, String apellido, String dni, String correo, String teléfono, double sueldoBase, double sueldoExtra, double sueldoNeto) {
		super(codigo, nombre, apellido, dni, correo, teléfono, sueldoBase, sueldoExtra, sueldoNeto);
		this.cargo = cargo;
		this.horasExtras = horasExtras;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

}
