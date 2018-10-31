package co.com.eafit.utilidad.mapeo;

import org.springframework.stereotype.Component;

import co.com.eafit.dto.MenuDTO;
import co.com.eafit.entidad.MenuEntity;

@Component("menuMapper")
public class MenuMapper {

	public MenuEntity dtoMenuAEntity(MenuDTO menuDTO) {
		MenuEntity menuEntity = new MenuEntity();
		menuEntity.setCategoria(menuDTO.getCategoria());
		menuEntity.setIdRestaurante(menuDTO.getIdRestaurante());
		return menuEntity;
	}

}