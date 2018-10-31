package co.com.eafit.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.com.eafit.dto.PagoDTO;
import co.com.eafit.repositorio.PagoRepositorio;
import co.com.eafit.utilidad.mapeo.PagoMapper;

@Service("pagoService")
public class PagoServicio{

	@Autowired
	@Qualifier("pagoRepository")
	private PagoRepositorio pagoRepository;
	
	@Autowired
	@Qualifier("pagoMapper")
	private PagoMapper pagoMapper;

	public void agregarPago(PagoDTO pagoDTO) {
		pagoRepository.save(pagoMapper.dtoPagoAEntity(pagoDTO));

	}

}