package co.com.eafit.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.eafit.dto.RestauranteDTO;
import co.com.eafit.servicio.restaurante.IRestauranteServicio;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

	@Autowired
	@Qualifier("restauranteService")
	private IRestauranteServicio restauranteServicio;
	
	@PostMapping("/registrarrestaurante")
	public void agregarRestaurante(@RequestBody RestauranteDTO restauranteDTO) {
		restauranteServicio.agregarRestaurante(restauranteDTO);
	}
	
	@GetMapping("/listarrestaurante")
	public List<RestauranteDTO> listarRestaurante(){
		return restauranteServicio.listarRestaurante();
	}
	
	@DeleteMapping("/eliminarrestaurante")
	public void eliminarRestaurante(@RequestBody String jsonBody) {
		restauranteServicio.eliminarRestaurante(jsonBody);
	}
}
