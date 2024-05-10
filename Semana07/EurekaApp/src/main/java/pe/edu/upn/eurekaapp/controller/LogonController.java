
package pe.edu.upn.eurekaapp.controller;

import pe.edu.upn.eurekaapp.dto.EmpleadosDto;
import pe.edu.upn.eurekaapp.service.LogonService;
import pe.edu.upn.eurekaapp.util.Session;

public class LogonController {

	public void validarUsuario(String usuario, String clave){
		LogonService service = new LogonService();
		EmpleadosDto dto = service.validarUsuario(usuario, clave);
		if(dto == null){
			throw new RuntimeException("Datos incorrectos.");
		}
		Session.put("usuario", dto);
	}
	
}
