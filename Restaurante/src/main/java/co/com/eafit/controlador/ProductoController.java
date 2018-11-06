package co.com.eafit.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.eafit.dto.ProductoDTO;
import co.com.eafit.servicio.producto.IProductoServicio;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	@Qualifier("productoService")
	private IProductoServicio productoServicio;
	
	@PostMapping("/agregarproducto")
	public void agregarProducto(@RequestBody ProductoDTO productoDTO) {
		productoServicio.agregarProducto(productoDTO);
	}
	
	@GetMapping("/listarproducto")
	public List<ProductoDTO> listarProducto(){
		return productoServicio.listarProducto();
	}
	
	@DeleteMapping("/eliminarproducto")
	public void eliminarProducto(@RequestBody ProductoDTO productoDTO){
		productoServicio.eliminarProducto(productoDTO);
	}
}
