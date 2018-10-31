package co.com.eafit.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.eafit.dto.MenuDTO;
import co.com.eafit.servicio.MenuServicio;

@RestController
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	@Qualifier("menuService")
	private MenuServicio menuServicio;
	
	@PostMapping("/agregarmenu")
	public void agregarMenu(@RequestBody MenuDTO menuDTO) {
		menuServicio.agregarMenu(menuDTO);
	}
}
