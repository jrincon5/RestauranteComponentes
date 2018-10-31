package co.com.eafit.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.com.eafit.dto.FacturaDTO;
import co.com.eafit.repositorio.FacturaRepositorio;
import co.com.eafit.utilidad.mapeo.FacturaMapper;

@Service("facturaService")
public class FacturaServicio{

	@Autowired
	@Qualifier("facturaRepository")
	private FacturaRepositorio facturaRepository;
	
	@Autowired
	@Qualifier("facturaMapper")
	private FacturaMapper facturaMapper;

	public void agregarFactura(FacturaDTO facturaDTO) {
		facturaRepository.save(facturaMapper.dtoFacturaAEntity(facturaDTO));

	}

}