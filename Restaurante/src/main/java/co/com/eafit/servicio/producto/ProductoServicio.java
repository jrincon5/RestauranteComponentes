package co.com.eafit.servicio.producto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.com.eafit.dto.ProductoDTO;
import co.com.eafit.entidad.ProductoEntity;
import co.com.eafit.repositorio.ProductoRepositorio;
import co.com.eafit.utilidad.mapeo.producto.IProductoMapper;

@Service("productoService")
public class ProductoServicio implements IProductoServicio {

	@Autowired
	@Qualifier("productoRepository")
	private ProductoRepositorio productoRepository;
	
	@Autowired
	@Qualifier("productoMapper")
	private IProductoMapper productoMapper;

	@Override
	public void agregarProducto(ProductoDTO productoDTO) {
		productoRepository.save(productoMapper.dtoProductoAEntity(productoDTO));

	}

	@Override
	public List<ProductoDTO> listarProducto() {
		return encontrarProductos();
	}
	
	private List<ProductoDTO> encontrarProductos(){
		List<ProductoDTO> listaProductoDTO = new ArrayList<>();
		List<ProductoEntity> listaProductoEntity = (List<ProductoEntity>) productoRepository.findAll();
		
		for(ProductoEntity productoEntity : listaProductoEntity) {
			listaProductoDTO.add(productoMapper.entityProductoADto(productoEntity));
		}
		return listaProductoDTO;
	}

	@Override
	public void eliminarProducto(ProductoDTO productoDTO) {
		productoRepository.eliminarProducto(productoDTO.getCategoria(), productoDTO.getNombre(), productoDTO.getRestaurante());
		
	}

}