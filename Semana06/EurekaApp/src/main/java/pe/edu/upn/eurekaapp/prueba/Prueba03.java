
package pe.edu.upn.eurekaapp.prueba;

import pe.edu.upn.eurekaapp.service.CuentaService;

public class Prueba03 {

	public static void main(String[] args) {
		
		try {
			// Datos
			String cuenta = "00100001";
			double importe = 5000.0;
			String empleado = "0003";
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
