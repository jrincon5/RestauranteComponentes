package co.com.eafit.servicio.pago;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.com.eafit.dto.PagoDTO;
import co.com.eafit.repositorio.PagoRepositorio;
import co.com.eafit.utilidad.mapeo.pago.IPagoMapper;

@Service("pagoService")
public class PagoServicio implements IPagoServicio {

	@Autowired
	@Qualifier("pagoRepository")
	private PagoRepositorio pagoRepository;
	
	@Autowired
	@Qualifier("pagoMapper")
	private IPagoMapper pagoMapper;

	@Override
	public void agregarPago(PagoDTO pagoDTO) {
		pagoRepository.save(pagoMapper.dtoPagoAEntity(pagoDTO));

	}

}