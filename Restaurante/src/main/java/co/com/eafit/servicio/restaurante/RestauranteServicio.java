package co.com.eafit.servicio.restaurante;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import co.com.eafit.dto.RestauranteDTO;
import co.com.eafit.entidad.RestauranteEntity;
import co.com.eafit.repositorio.RestauranteRepositorio;
import co.com.eafit.utilidad.mapeo.restaurante.IRestauranteMapper;

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
		restauranteRepository.save(restauranteMapper.dtoRestauranteAEntity(restauranteDTO));

	}

	@Override
	public List<RestauranteDTO> listarRestaurante() {
		return encontrarRestaurantes();
	}
	
	private List<RestauranteDTO> encontrarRestaurantes(){
		List<RestauranteDTO> listaRestauranteDTO = new ArrayList<>();
		List<RestauranteEntity> listaRestauranteEntity = (List<RestauranteEntity>) restauranteRepository.findAll();
		
		for(RestauranteEntity restauranteEntity : listaRestauranteEntity) {
			listaRestauranteDTO.add(restauranteMapper.entityRestauranteADto(restauranteEntity));
		}
		return listaRestauranteDTO;
	}

	@Override
	public void eliminarRestaurante(String jsonBody) {
		String tipoDocumento = extraerStringDesdeJson("tipoDocumento", jsonBody);
		String numeroDocumento = extraerStringDesdeJson("numeroDocumento", jsonBody);
		restauranteRepository.eliminarRestaurante(tipoDocumento, numeroDocumento);		
	}
	
	public String extraerStringDesdeJson(String variable, String json) {
		JsonObject jobj = new Gson().fromJson(json, JsonObject.class);
		String result = jobj.get(variable).getAsString();
		return result;
	}

}
