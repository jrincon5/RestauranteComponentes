package co.com.eafit.utilidad.mapeo;

import org.springframework.stereotype.Component;

import co.com.eafit.dto.PedidoDTO;
import co.com.eafit.entidad.PedidoEntity;

@Component("pedidoMapper")
public class PedidoMapper {

	public PedidoEntity dtoPedidoAEntity(PedidoDTO pedidoDTO) {
		PedidoEntity pedidoEntity = new PedidoEntity();
		pedidoEntity.setTiempoEspera(pedidoDTO.getTiempoEspera());
		pedidoEntity.setProductos(pedidoDTO.getProductos());
		pedidoEntity.setTotal(pedidoDTO.getTotal());
		return pedidoEntity;
	}

}