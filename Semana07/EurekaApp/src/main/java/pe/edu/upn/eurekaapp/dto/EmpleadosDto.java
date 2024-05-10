package pe.edu.upn.eurekaapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class EmpleadosDto {

	private String codigo;
	private String paterno;
	private String materno;
	private String nombre;
	private String ciudad;
	private String direccion;
	private String usuario;
	private String clave;

}
