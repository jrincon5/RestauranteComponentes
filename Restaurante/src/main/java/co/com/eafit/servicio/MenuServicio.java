package co.com.eafit.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.com.eafit.dto.MenuDTO;
import co.com.eafit.repositorio.MenuRepositorio;
import co.com.eafit.utilidad.mapeo.MenuMapper;

@Service("menuService")
public class MenuServicio{

	@Autowired
	@Qualifier("menuRepository")
	private MenuRepositorio menuRepository;
	
	@Autowired
	@Qualifier("menuMapper")
	private MenuMapper menuMapper;

	public void agregarMenu(MenuDTO menuDTO) {
		menuRepository.save(menuMapper.dtoMenuAEntity(menuDTO));

	}

}