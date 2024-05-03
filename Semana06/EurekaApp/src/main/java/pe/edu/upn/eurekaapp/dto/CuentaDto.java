
package pe.edu.upn.eurekaapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor //@ToString
public class CuentaDto {

	private String cuenta;
	private String moneda;
	private String cliente;
	private Double saldo;
	private String estado;
	
	
	
	
}
