
package pe.edu.upn.mateapp.prueba;

import pe.edu.upn.mateapp.service.MateService;

public class Prueba02 {
	
	public static void main(String[] args) {
		// Datos
		int num1 = 60;
		int num2 = 40;
		int valorEsperado = 20;
		// Proceso
		MateService service = new MateService();
		int resta = service.restar(num1, num2);		
		// Reporte
		System.out.println("Valor esperado: " + valorEsperado);
		System.out.println("Valor obtenido: " + resta);
	}
	
	
}
