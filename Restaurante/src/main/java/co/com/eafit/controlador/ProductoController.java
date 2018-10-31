package co.com.eafit.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.eafit.dto.ProductoDTO;
import co.com.eafit.servicio.ProductoServicio;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	@Qualifier("productoService")
	private ProductoServicio productoServicio;
	
	@PostMapping("/agregarproducto")
	public void agregarProducto(@RequestBody ProductoDTO productoDTO) {
		productoServicio.agregarProducto(productoDTO);
	}
}
