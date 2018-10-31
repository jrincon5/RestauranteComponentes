package co.com.eafit.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.com.eafit.dto.ProductoDTO;
import co.com.eafit.repositorio.ProductoRepositorio;
import co.com.eafit.utilidad.mapeo.ProductoMapper;

@Service("productoService")
public class ProductoServicio{

	@Autowired
	@Qualifier("productoRepository")
	private ProductoRepositorio productoRepository;
	
	@Autowired
	@Qualifier("productoMapper")
	private ProductoMapper productoMapper;

	public void agregarProducto(ProductoDTO productoDTO) {
		productoRepository.save(productoMapper.dtoProductoAEntity(productoDTO));

	}

}