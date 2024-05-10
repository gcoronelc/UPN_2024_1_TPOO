
package pe.edu.upn.eurekaapp.prueba;

import java.util.Arrays;
import pe.edu.upn.eurekaapp.dto.EmpleadosDto;
import pe.edu.upn.eurekaapp.service.CuentaService;
import pe.edu.upn.eurekaapp.service.LogonService;
import pe.edu.upn.eurekaapp.util.Session;


public class Prueba04 {

	public static void main(String[] args) {
		try {
			// Datos
			String usuario = "cromeros";
			String clave = "chicho";
			// Proceso
			LogonService service = new LogonService();
			EmpleadosDto dto = service.validarUsuario(usuario, clave);
			if(dto == null){
				throw new RuntimeException("Datos incorrectos");
			}
			// Reporte
			System.out.println(dto.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
