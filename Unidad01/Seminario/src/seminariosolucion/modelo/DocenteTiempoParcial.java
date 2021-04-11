package seminariosolucion.modelo;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class DocenteTiempoParcial extends Docente{

	public DocenteTiempoParcial() {
	}

	public DocenteTiempoParcial(String grado, boolean investiga, int codigo, String nombre, String apellido, String dni, String correo, String teléfono, double sueldoBase, double sueldoExtra, double sueldoNeto) {
		super(grado, investiga, codigo, nombre, apellido, dni, correo, teléfono, sueldoBase, sueldoExtra, sueldoNeto);
	}

}
