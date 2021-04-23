package pe.ucont.sistcomercial.prueba;

import java.util.List;
import pe.ucont.sistcomercial.dto.CategoriaDto;
import pe.ucont.sistcomercial.service.CategoriaService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba04 {

	public static void main(String[] args) {
		try {
			CategoriaService service = new CategoriaService();
			List<CategoriaDto> lista = service.traerTodos();
			for (CategoriaDto dto : lista) {
				System.out.println(dto.getIdcat() + " - " + dto.getNombre());
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
