
package pe.edu.upn.programandoando.prueba;

import pe.edu.upn.programandoando.dto.VentaDto;
import pe.edu.upn.programandoando.service.VentaService;

public class Prueba05 {

	public static void main(String[] args) {
		// Datos
		VentaDto dto = new VentaDto();
		dto.setProducto("Televisor");
		dto.setPrecio(100.0);
		dto.setCantidad(10);
		// Proceso
		VentaService service = new VentaService();
		dto = service.procesarVenta(dto);
		// Reporte
		System.out.println("Importe: " + dto.getImporte());
		System.out.println("Impuesto: " + dto.getImpuesto());
		System.out.println("Total: " + dto.getTotal());
	}
}
