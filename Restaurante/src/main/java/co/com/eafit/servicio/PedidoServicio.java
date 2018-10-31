package co.com.eafit.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.com.eafit.dto.PedidoDTO;
import co.com.eafit.repositorio.PedidoRepositorio;
import co.com.eafit.utilidad.mapeo.PedidoMapper;

@Service("pedidoService")
public class PedidoServicio{

	@Autowired
	@Qualifier("pedidoRepository")
	private PedidoRepositorio pedidoRepository;
	
	@Autowired
	@Qualifier("pedidoMapper")
	private PedidoMapper pedidoMapper;

	public void agregarPedido(PedidoDTO pedidoDTO) {
		pedidoRepository.save(pedidoMapper.dtoPedidoAEntity(pedidoDTO));

	}

}