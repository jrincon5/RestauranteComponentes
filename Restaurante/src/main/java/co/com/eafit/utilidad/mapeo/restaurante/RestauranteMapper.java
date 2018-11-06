package co.com.eafit.utilidad.mapeo.restaurante;

import org.springframework.stereotype.Component;

import co.com.eafit.dto.RestauranteDTO;
import co.com.eafit.entidad.RestauranteEntity;

@Component("restauranteMapper")
public class RestauranteMapper implements IRestauranteMapper {

	@Override
	public RestauranteEntity dtoRestauranteAEntity(RestauranteDTO restauranteDTO) {
		RestauranteEntity restauranteEntity = new RestauranteEntity();
		restauranteEntity.setNombre(restauranteDTO.getNombre());
		restauranteEntity.setDescripcion(restauranteDTO.getDescripcion());
		restauranteEntity.setDireccion(restauranteDTO.getDireccion());
		restauranteEntity.setTelefono(restauranteDTO.getTelefono());
		restauranteEntity.setTipoRestaurante(restauranteDTO.getTipoRestaurante());
		restauranteEntity.setTipoDocumento(restauranteDTO.getTipoDocumento());
		restauranteEntity.setNumeroDocumento(restauranteDTO.getNumeroDocumento());
		return restauranteEntity;
	}

	@Override
	public RestauranteDTO entityRestauranteADto(RestauranteEntity restauranteEntity) {
		RestauranteDTO restauranteDTO = new RestauranteDTO();
		restauranteDTO.setNombre(restauranteEntity.getNombre());
		restauranteDTO.setDescripcion(restauranteEntity.getDescripcion());
		restauranteDTO.setDireccion(restauranteEntity.getDireccion());
		restauranteDTO.setTelefono(restauranteEntity.getTelefono());
		restauranteDTO.setTipoRestaurante(restauranteEntity.getTipoRestaurante());
		restauranteDTO.setTipoDocumento(restauranteEntity.getTipoDocumento());
		restauranteDTO.setNumeroDocumento(restauranteEntity.getNumeroDocumento());
		return restauranteDTO;
	}

}
