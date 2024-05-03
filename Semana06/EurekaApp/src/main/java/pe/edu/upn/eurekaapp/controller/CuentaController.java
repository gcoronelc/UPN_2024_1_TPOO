
package pe.edu.upn.eurekaapp.controller;

import java.util.List;
import pe.edu.upn.eurekaapp.dto.CuentaDto;
import pe.edu.upn.eurekaapp.service.CuentaService;

public class CuentaController {
	
	private CuentaService cuentaService;

	public CuentaController() {
		cuentaService = new CuentaService();
	}
	
	public List<CuentaDto> listaCuentas(){
		return cuentaService.listaCuentas();
	}
	
	

}
