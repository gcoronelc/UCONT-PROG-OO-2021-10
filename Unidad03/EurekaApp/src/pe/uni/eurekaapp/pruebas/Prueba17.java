package pe.uni.eurekaapp.pruebas;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import pe.uni.eurekaapp.service.CuentaService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba17 {

	public static void main(String[] args) {
		try {
			// Cuenta
			String cuenta = "00100001";
			// Usando una colección de datos
			CuentaService service = new CuentaService();
			List<Map<String, ?>> lista = service.getMovimientos(cuenta);
			JRMapCollectionDataSource data = new JRMapCollectionDataSource(lista);
			Map pars = new HashMap();
			String reporte = "/pe/uni/eurekaapp/reportes/repoMovimientos.jrxml";
			InputStream is = Class.class.getResourceAsStream(reporte);
			JasperReport rep = JasperCompileManager.compileReport(is);
			JasperPrint print = JasperFillManager.fillReport(rep, pars, data);
			// Visualizando el Reporte
			JasperViewer viewer = new JasperViewer(print, false);
			viewer.setTitle("Mi Reporte");
			viewer.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
