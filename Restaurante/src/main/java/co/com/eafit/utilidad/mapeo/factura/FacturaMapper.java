package co.com.eafit.utilidad.mapeo.factura;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import co.com.eafit.dto.FacturaDTO;
import co.com.eafit.dto.ProductoDTO;
import co.com.eafit.entidad.FacturaEntity;

@Component("facturaMapper")
public class FacturaMapper implements IFacturaMapper{

	@Override
	public FacturaEntity dtoFacturaAEntity(FacturaDTO facturaDTO) {
		FacturaEntity facturaEntity = new FacturaEntity();
		facturaEntity.setProductos(extraerProductosLista(facturaDTO.getProductos()));
		facturaEntity.setTotal(facturaDTO.getTotal()+facturaDTO.getPropina());
		facturaEntity.setPropina(facturaDTO.getPropina());
		facturaEntity.setReferenciaPago(facturaDTO.getReferenciaPago());
		return facturaEntity;
	}
	
	@Override
	public FacturaDTO entityFacturaADto(FacturaEntity facturaEntity) {
		FacturaDTO facturaDTO = new FacturaDTO();
		facturaDTO.setProductos(extraerProductosString(facturaEntity.getProductos().toString()));
		facturaDTO.setTotal(facturaEntity.getTotal());
		facturaDTO.setPropina(facturaEntity.getPropina());
		facturaDTO.setReferenciaPago(facturaEntity.getReferenciaPago());
		return facturaDTO;
	}
	
	private List<ProductoDTO> extraerProductosString(String stringProductos){
		
		List<ProductoDTO> listProductos = new ArrayList<>();
		try {
			String[] productos = stringProductos.split("\\|");
			for(String producto : productos) {
				try {
					String[] productoSplit = producto.split("-");
					listProductos.add(new ProductoDTO(productoSplit[0], Double.parseDouble(productoSplit[1]), "", ""));
				}catch(Exception e) {
				
				}
			}
		}catch(Exception e) {
		}
		
		return listProductos;
	}
	
	private String extraerProductosLista(List<ProductoDTO> listaProductos) {
		String productos = "|";
		for(ProductoDTO producto : listaProductos){
			productos += producto.getNombre()+"-";
			productos += producto.getPrecio()+"|";
		}
		return productos;
	}

}