package seminariosolucion.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Universidad {
	
	private List<Administrativo> administrativos;
	private List<DocenteTiempoCompleto> docentesTiempoCompleto;
	private List<DocenteTiempoParcial> docentesTiempoParcial;

	public Universidad() {
		administrativos = new ArrayList<>();
		docentesTiempoCompleto = new ArrayList<>();
		docentesTiempoParcial = new ArrayList<>();
	}
	
	public void registrarAdministrativo(Administrativo administrativo){
		administrativos.add(administrativo);
	}
	
	public void listarPersonalAdministrativo(){
		for (Administrativo bean : administrativos) {
			System.out.println(bean.getNombre());
		}
	}
	
}
