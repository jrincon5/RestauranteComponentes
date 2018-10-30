package co.com.eafit.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.eafit.dto.RestauranteDTO;
import co.com.eafit.servicio.IRestauranteServicio;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

	@Autowired
	@Qualifier("restauranteService")
	private IRestauranteServicio restauranteServicio;
	
	@PostMapping("/agregarrestaurante")
	public void agregarRestaurante(@RequestBody RestauranteDTO restauranteDTO) {
		restauranteServicio.agregarRestaurante(restauranteDTO);
	}
}
