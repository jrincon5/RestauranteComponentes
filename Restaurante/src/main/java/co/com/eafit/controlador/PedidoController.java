package co.com.eafit.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.eafit.dto.PedidoDTO;
import co.com.eafit.servicio.PedidoServicio;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	@Qualifier("pedidoService")
	private PedidoServicio pedidoServicio;
	
	@PostMapping("/agregarpedido")
	public void agregarPedido(@RequestBody PedidoDTO pedidoDTO) {
		pedidoServicio.agregarPedido(pedidoDTO);
	}
}