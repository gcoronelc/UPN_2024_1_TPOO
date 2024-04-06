package pe.edu.upn.programandoando.prueba;

import pe.edu.upn.programandoando.service.MateService;


public class Prueba08 {
	
	public static void main(String[] args) {
		// Datos
		int n1 = 90;
		int n2 = 70;
		// Proceso
		MateService service = new MateService();
		int suma = service.sumar(n1, n2);
		// Reporte
		System.out.println("Suma: " + suma);
	}

}
