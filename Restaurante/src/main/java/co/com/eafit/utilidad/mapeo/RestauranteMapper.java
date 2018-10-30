package co.com.eafit.utilidad.mapeo;

import org.springframework.stereotype.Component;

import co.com.eafit.dto.RestauranteDTO;
import co.com.eafit.entidad.RestauranteEntity;

@Component("restauranteMapper")
public class RestauranteMapper implements IRestauranteMapper {

	@Override
	public RestauranteEntity dtoRestauranteAEntity(RestauranteDTO restauranteDTO) {
		/*RestauranteEntity restauranteEntity = new RestauranteEntity();
		restauranteEntity.setNombre(restauranteDTO.getNombre());
		restauranteEntity.setDescripcion(restauranteDTO.getNombre());
		restauranteEntity.setDireccion(restauranteDTO.getDireccion());
		restauranteEntity.setTelefono(restauranteDTO.getTelefono());
		restauranteEntity.setTipoRestaurante(restauranteDTO.getTipoRestaurante());*/
		return null;
	}

}
