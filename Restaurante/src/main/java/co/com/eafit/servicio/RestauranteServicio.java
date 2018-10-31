package co.com.eafit.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.com.eafit.dto.RestauranteDTO;
import co.com.eafit.repositorio.RestauranteRepositorio;
import co.com.eafit.utilidad.mapeo.IRestauranteMapper;

@Service("restauranteService")
public class RestauranteServicio implements IRestauranteServicio {

	@Autowired
	@Qualifier("restauranteRepository")
	private RestauranteRepositorio restauranteRepository;
	
	@Autowired
	@Qualifier("restauranteMapper")
	private IRestauranteMapper restauranteMapper;

	@Override
	public void agregarRestaurante(RestauranteDTO restauranteDTO) {
		//restauranteMapper.dtoRestauranteAEntity(restauranteDTO);
		//restauranteRepository.count();
		restauranteRepository.save(restauranteMapper.dtoRestauranteAEntity(restauranteDTO));

	}

}
