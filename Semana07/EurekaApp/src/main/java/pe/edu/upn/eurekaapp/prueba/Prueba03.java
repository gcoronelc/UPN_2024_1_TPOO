
package pe.edu.upn.eurekaapp.prueba;

import pe.edu.upn.eurekaapp.service.CuentaService;
import pe.edu.upn.eurekaapp.util.Session;


public class Prueba03 {

	public static void main(String[] args) {
		try {
			// Datos
			String cuenta = "00100001";
			double importe = 5000.0;
			String empleado = Session.get("usuario").toString();
			// Proceso
			CuentaService service = new CuentaService();
			service.deposito(cuenta, importe, empleado);
			// Reporte
			System.out.println("Todo ok.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
