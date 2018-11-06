package co.com.eafit.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.eafit.dto.PagoDTO;
import co.com.eafit.servicio.pago.IPagoServicio;

@RestController
@RequestMapping("/pago")
public class PagoController {

	@Autowired
	@Qualifier("pagoService")
	private IPagoServicio pagoServicio;
	
	@PostMapping("/agregarpago")
	public void agregarPago(@RequestBody PagoDTO pagoDTO) {
		pagoServicio.agregarPago(pagoDTO);
	}
}