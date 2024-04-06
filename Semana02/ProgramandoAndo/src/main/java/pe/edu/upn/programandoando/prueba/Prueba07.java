package pe.edu.upn.programandoando.prueba;

import pe.edu.upn.programandoando.dto.VentaDto;
import pe.edu.upn.programandoando.service.VentaService;


public class Prueba07 {
	
	public static void main(String[] args) {
		VentaService service = new VentaService();
		service.initBean();
		for(VentaDto dto: service.obtenerVenta()){
			System.out.println(dto.getProducto() + " - " + dto.getTotal());
		}
	}

}
