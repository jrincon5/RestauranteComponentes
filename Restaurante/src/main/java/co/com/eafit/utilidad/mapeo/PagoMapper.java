package co.com.eafit.utilidad.mapeo;

import org.springframework.stereotype.Component;

import co.com.eafit.dto.PagoDTO;
import co.com.eafit.entidad.PagoEntity;

@Component("pagoMapper")
public class PagoMapper {

	public PagoEntity dtoPagoAEntity(PagoDTO pagoDTO) {
		PagoEntity pagoEntity = new PagoEntity();
		pagoEntity.setIdPedido(pagoDTO.getIdPedido());
		pagoEntity.setValor(pagoDTO.getValor());
		pagoEntity.setTipoPago(pagoDTO.getTipoPago());
		pagoEntity.setEstado(pagoDTO.getEstado());
		return pagoEntity;
	}

}