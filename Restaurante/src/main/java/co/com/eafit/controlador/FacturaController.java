package co.com.eafit.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.eafit.dto.FacturaDTO;
import co.com.eafit.servicio.factura.IFacturaServicio;

@RestController
@RequestMapping("/factura")
public class FacturaController {

	@Autowired
	@Qualifier("facturaService")
	private IFacturaServicio facturaServicio;
	
	@PostMapping("/agregarfactura")
	public void agregarFactura(@RequestBody FacturaDTO facturaDTO) {
		facturaServicio.agregarFactura(facturaDTO);
	}
	
	@GetMapping("/listarfactura")
	public FacturaDTO listarFactura(@RequestBody String referenciaPago) {
		return facturaServicio.listarFactura(referenciaPago);
	}
}