package co.com.eafit.utilidad.mapeo;

import co.com.eafit.dto.RestauranteDTO;
import co.com.eafit.entidad.RestauranteEntity;

public interface IRestauranteMapper {

	public RestauranteEntity dtoRestauranteAEntity(RestauranteDTO restauranteDTO);
}
