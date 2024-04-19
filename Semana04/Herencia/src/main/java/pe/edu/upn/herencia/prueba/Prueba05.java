package pe.edu.upn.herencia.prueba;

import pe.edu.upn.herencia.herencia.PersonaAbstract;

public class Prueba05 {

	public static void main(String[] args) {

		PersonaAbstract bean = new PersonaAbstract() {

			@Override
			public void mostrarDatos() {
				System.out.println("Hello word!!!");
			}

		};
		
		PersonaAbstract bean2 = new PersonaAbstract() {

			@Override
			public void mostrarDatos() {
				System.out.println("Hola aula!!");
			}

		};
		
		bean.mostrarDatos();
		bean2.mostrarDatos();

	}

}
