package co.com.eafit.servicio.pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.com.eafit.dto.PedidoDTO;
import co.com.eafit.repositorio.PedidoRepositorio;
import co.com.eafit.utilidad.mapeo.pedido.IPedidoMapper;

@Service("pedidoService")
public class PedidoServicio implements IPedidoServicio {

	@Autowired
	@Qualifier("pedidoRepository")
	private PedidoRepositorio pedidoRepository;
	
	@Autowired
	@Qualifier("pedidoMapper")
	private IPedidoMapper pedidoMapper;

	@Override
	public void agregarPedido(PedidoDTO pedidoDTO) {
		pedidoRepository.save(pedidoMapper.dtoPedidoAEntity(pedidoDTO));

	}

}