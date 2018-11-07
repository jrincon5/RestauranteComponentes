package co.com.eafit.servicio.factura;

import java.util.List;

import co.com.eafit.dto.FacturaDTO;

public interface IFacturaServicio {
	public void agregarFactura(FacturaDTO facturaDTO);
	public FacturaDTO listarFactura(String referenciaPago);
	public List<FacturaDTO> listarFacturaTotal();
}
