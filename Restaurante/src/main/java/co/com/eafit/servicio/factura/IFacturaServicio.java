package co.com.eafit.servicio.factura;

import co.com.eafit.dto.FacturaDTO;

public interface IFacturaServicio {
	public void agregarFactura(FacturaDTO facturaDTO);
	public FacturaDTO listarFactura(String referenciaPago);
}
