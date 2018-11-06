package co.com.eafit.utilidad.mapeo.pago;

import co.com.eafit.dto.PagoDTO;
import co.com.eafit.entidad.PagoEntity;

public interface IPagoMapper {
	public PagoEntity dtoPagoAEntity(PagoDTO pagoDTO);
}
