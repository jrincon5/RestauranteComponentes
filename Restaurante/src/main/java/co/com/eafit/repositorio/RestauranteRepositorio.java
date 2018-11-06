package co.com.eafit.repositorio;

import java.io.Serializable;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.com.eafit.entidad.RestauranteEntity;

@Repository("restauranteRepository")
public interface RestauranteRepositorio extends CrudRepository<RestauranteEntity, Serializable> {

	@Transactional
	@Modifying
	@Query("DELETE FROM RestauranteEntity t WHERE t.tipoDocumento =:tipoDocumento AND t.numeroDocumento =:numeroDocumento")
	public void eliminarRestaurante(@Param("tipoDocumento") String tipoDocumento,
			@Param("numeroDocumento") String numeroDocumento);
}
