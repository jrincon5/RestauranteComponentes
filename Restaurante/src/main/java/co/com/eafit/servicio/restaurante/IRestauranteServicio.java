package co.com.eafit.servicio.restaurante;

import java.util.List;

import co.com.eafit.dto.RestauranteDTO;

public interface IRestauranteServicio {

	public void agregarRestaurante(RestauranteDTO restauranteDTO);
	public List<RestauranteDTO> listarRestaurante();
	public void eliminarRestaurante(String jsonBody);
}
