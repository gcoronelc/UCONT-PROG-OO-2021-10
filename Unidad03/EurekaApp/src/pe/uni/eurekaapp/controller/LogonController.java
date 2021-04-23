package pe.uni.eurekaapp.controller;

import pe.uni.eurekaapp.model.EmpleadoModel;
import pe.uni.eurekaapp.service.LogonService;
import pe.uni.eurekaapp.util.Session;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class LogonController {

	private LogonService logonService;

	public LogonController() {
		logonService = new LogonService();
	}
	
	public void validar(String usuario, String clave){
		EmpleadoModel model = logonService.validar(usuario, clave);
		Session.put("USUARIO", model);
	}
	
}
