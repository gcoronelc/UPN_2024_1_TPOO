
package pe.edu.upn.eurekaapp.prueba;

import java.util.List;
import pe.edu.upn.eurekaapp.dto.CuentaDto;
import pe.edu.upn.eurekaapp.service.CuentaService;

public class Prueba02 {

	public static void main(String[] args) {
		
		try {
			// Variables
			List<CuentaDto> lista;
			// Proceso
			CuentaService service = new CuentaService();
			lista = service.listaCuentas();
			// Reporte
			for (CuentaDto dto : lista) {
				System.out.println(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
