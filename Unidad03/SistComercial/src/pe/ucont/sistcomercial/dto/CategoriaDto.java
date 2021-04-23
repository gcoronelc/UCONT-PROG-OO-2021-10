package pe.ucont.sistcomercial.dto;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class CategoriaDto {

	private int idcat;
	private String nombre;

	public CategoriaDto() {
	}

	public CategoriaDto(int idcat, String nombre) {
		this.idcat = idcat;
		this.nombre = nombre;
	}

	public int getIdcat() {
		return idcat;
	}

	public void setIdcat(int idcat) {
		this.idcat = idcat;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
