package pe.uni.eurekaapp.pruebas;

import java.util.List;
import java.util.Map;
import pe.uni.eurekaapp.service.CuentaService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba13 {
	
	public static void main(String[] args) {
		try {
			CuentaService cuentaService = new CuentaService();
			List<Map<String,?>> lista = cuentaService.getMovimientos("00100001");
			for(Map<String,?> r: lista){
				String nro = r.get("MOVINUMERO").toString();
				String descripcion = r.get("TIPONOMBRE").toString();
				String importe = r.get("MOVIIMPORTE").toString();
				System.out.println(nro + " - " + descripcion + " - " + importe);
			}
			System.out.println("Proceso ok.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 		
	}

}
