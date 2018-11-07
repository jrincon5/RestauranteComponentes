package co.com.eafit.servicio.factura;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import co.com.eafit.dto.FacturaDTO;
import co.com.eafit.dto.ProductoDTO;
import co.com.eafit.entidad.FacturaEntity;
import co.com.eafit.entidad.ProductoEntity;
import co.com.eafit.repositorio.FacturaRepositorio;
import co.com.eafit.utilidad.mapeo.factura.IFacturaMapper;

@Service("facturaService")
public class FacturaServicio implements IFacturaServicio {

	@Autowired
	@Qualifier("facturaRepository")
	private FacturaRepositorio facturaRepository;
	
	@Autowired
	@Qualifier("facturaMapper")
	private IFacturaMapper facturaMapper;

	@Override
	public void agregarFactura(FacturaDTO facturaDTO) {
		facturaRepository.save(facturaMapper.dtoFacturaAEntity(facturaDTO));

	}

	@Override
	public FacturaDTO listarFactura(String json) {
		int referenciaPago = extraerIntDesdeJson(json);
		return facturaMapper.entityFacturaADto(facturaRepository.findByReferenciaPago(referenciaPago));
	}
	
	@Override
	public List<FacturaDTO> listarFacturaTotal() {
		return encontrarFacturas();
	}
	
	private List<FacturaDTO> encontrarFacturas(){
		List<FacturaDTO> listaFacturaDTO = new ArrayList<>();
		List<FacturaEntity> listaFacturaEntity = (List<FacturaEntity>) facturaRepository.findAll();
		
		for(FacturaEntity facturaEntity : listaFacturaEntity) {
			listaFacturaDTO.add(facturaMapper.entityFacturaADto(facturaEntity));
		}
		return listaFacturaDTO;
	}
	
	
	public int extraerIntDesdeJson(String json) {
		JsonObject jobj = new Gson().fromJson(json, JsonObject.class);
		String result = jobj.get("referenciaPago").getAsString();
		return Integer.parseInt(result);
	}

}