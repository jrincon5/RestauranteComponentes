package co.com.eafit.utilidad.mapeo;

import org.springframework.stereotype.Component;

import co.com.eafit.dto.FacturaDTO;
import co.com.eafit.entidad.FacturaEntity;

@Component("facturaMapper")
public class FacturaMapper {

	public FacturaEntity dtoFacturaAEntity(FacturaDTO facturaDTO) {
		FacturaEntity facturaEntity = new FacturaEntity();
		facturaEntity.setIdPedido(facturaDTO.getIdPedido());
		return facturaEntity;
	}

}