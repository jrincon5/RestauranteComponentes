package co.com.eafit.repositorio;

import java.io.Serializable;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.com.eafit.entidad.ProductoEntity;

@Repository("productoRepository")
public interface ProductoRepositorio extends CrudRepository<ProductoEntity, Serializable> {
		
	@Transactional
	@Modifying
	@Query("DELETE FROM ProductoEntity t WHERE t.categoria =:categoria AND t.nombre =:nombre AND t.restaurante =:restaurante")
	public void eliminarProducto(@Param("categoria") String categoria, @Param("nombre") String nombre, 
			@Param("restaurante") String restaurante);

}