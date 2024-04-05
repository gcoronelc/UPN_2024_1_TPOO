
package pe.edu.upn.mateapp.prueba;

import pe.edu.upn.mateapp.service.MateService;

public class Prueba01 {
	
	public static void main(String[] args) {
		// Datos
		int num1 = 60;
		int num2 = 40;
		int valorEsperado = 100;
		// Proceso
		MateService service = new MateService();
		int suma = service.sumar(num1, num2);		
		// Reporte
		System.out.println("Valor esperado: " + valorEsperado);
		System.out.println("Valor obtenido: " + suma);
	}
	
	
}
