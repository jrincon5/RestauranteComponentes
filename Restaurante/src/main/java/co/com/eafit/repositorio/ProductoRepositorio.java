package co.com.eafit.repositorio;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.eafit.entidad.ProductoEntity;

@Repository("productoRepository")
public interface ProductoRepositorio extends CrudRepository<ProductoEntity, Serializable> {

}