package co.com.eafit.repositorio;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.eafit.entidad.PagoEntity;

@Repository("facturaRepository")
public interface PagoRepositorio extends CrudRepository<PagoEntity, Serializable> {

}
