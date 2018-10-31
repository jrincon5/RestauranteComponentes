package co.com.eafit.repositorio;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.eafit.entidad.FacturaEntity;

@Repository("facturaRepository")
public interface FacturaRepositorio extends CrudRepository<FacturaEntity, Serializable> {

}