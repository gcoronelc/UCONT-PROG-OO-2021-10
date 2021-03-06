package seminariosolucion.modelo;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public abstract class Personal {

	// Variables
	private int codigo;
	private String nombre;
	private String apellido;
	private String dni;
	private String correo;
	private String teléfono;
	private double sueldoBase;
	private double sueldoExtra; // Administrativo: Horas extras   Docente: Investigacion
	private double sueldoNeto;

	// Constructor por defecto
	public Personal() {
	}

	// Constructor con parametros

	public Personal(int codigo, String nombre, String apellido, String dni, String correo, String teléfono, double sueldoBase, double sueldoExtra, double sueldoNeto) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.correo = correo;
		this.teléfono = teléfono;
		this.sueldoBase = sueldoBase;
		this.sueldoExtra = sueldoExtra;
		this.sueldoNeto = sueldoNeto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTeléfono() {
		return teléfono;
	}

	public void setTeléfono(String teléfono) {
		this.teléfono = teléfono;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public double getSueldoExtra() {
		return sueldoExtra;
	}

	public void setSueldoExtra(double sueldoExtra) {
		this.sueldoExtra = sueldoExtra;
	}

	public double getSueldoNeto() {
		return sueldoNeto;
	}

	public void setSueldoNeto(double sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}

	
	
}
