package co.com.eafit.utilidad.mapeo.pedido;

import co.com.eafit.dto.PedidoDTO;
import co.com.eafit.entidad.PedidoEntity;

public interface IPedidoMapper {
	public PedidoEntity dtoPedidoAEntity(PedidoDTO pedidoDTO);
}
