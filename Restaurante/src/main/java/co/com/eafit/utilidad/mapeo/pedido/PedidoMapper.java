package co.com.eafit.utilidad.mapeo.pedido;

import java.util.List;

import org.springframework.stereotype.Component;

import co.com.eafit.dto.PedidoDTO;
import co.com.eafit.dto.ProductoDTO;
import co.com.eafit.entidad.PedidoEntity;

@Component("pedidoMapper")
public class PedidoMapper implements IPedidoMapper {

	@Override
	public PedidoEntity dtoPedidoAEntity(PedidoDTO pedidoDTO) {
		PedidoEntity pedidoEntity = new PedidoEntity();
		pedidoEntity.setTiempoEspera(pedidoDTO.getTiempoEspera());
		pedidoEntity.setProductos(extraerProductos(pedidoDTO.getProductos()));
		pedidoEntity.setTotal(totalPagar(pedidoDTO.getProductos()));
		pedidoEntity.setRestaurante(pedidoDTO.getRestaurante());
		return pedidoEntity;
	}
	
	private String extraerProductos(List<ProductoDTO> listaProductos) {
		String productos = "|";
		for(ProductoDTO producto : listaProductos){
			productos += producto.getNombre()+"|";
		}
		return productos;
	}
	
	private double totalPagar(List<ProductoDTO> listaProductos) {
		double totalPagar = 0;
		for(ProductoDTO producto : listaProductos){
			totalPagar += producto.getPrecio();
		}
		return totalPagar;
	}

}