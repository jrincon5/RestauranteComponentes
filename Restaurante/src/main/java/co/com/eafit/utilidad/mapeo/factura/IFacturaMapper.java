package co.com.eafit.utilidad.mapeo.factura;

import co.com.eafit.dto.FacturaDTO;
import co.com.eafit.entidad.FacturaEntity;

public interface IFacturaMapper {
	
	public FacturaEntity dtoFacturaAEntity(FacturaDTO facturaDTO);
	public FacturaDTO entityFacturaADto(FacturaEntity facturaEntity);

}
