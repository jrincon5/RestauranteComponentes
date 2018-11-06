package co.com.eafit.utilidad.mapeo.restaurante;

import co.com.eafit.dto.RestauranteDTO;
import co.com.eafit.entidad.RestauranteEntity;

public interface IRestauranteMapper {

	public RestauranteEntity dtoRestauranteAEntity(RestauranteDTO restauranteDTO);
	public RestauranteDTO entityRestauranteADto(RestauranteEntity restauranteDTO);
}
