package co.com.eafit.utilidad.mapeo.producto;

import org.springframework.stereotype.Component;

import co.com.eafit.dto.ProductoDTO;
import co.com.eafit.entidad.ProductoEntity;

@Component("productoMapper")
public class ProductoMapper implements IProductoMapper {

	@Override
	public ProductoEntity dtoProductoAEntity(ProductoDTO productoDTO) {
		ProductoEntity productoEntity = new ProductoEntity();
		productoEntity.setNombre(productoDTO.getNombre());
		productoEntity.setPrecio(productoDTO.getPrecio());
		productoEntity.setCategoria(productoDTO.getCategoria());
		productoEntity.setRestaurante(productoDTO.getRestaurante());
		return productoEntity;
	}

	@Override
	public ProductoDTO entityProductoADto(ProductoEntity productoEntity) {
		ProductoDTO productoDTO = new ProductoDTO();
		productoDTO.setNombre(productoEntity.getNombre());
		productoDTO.setPrecio(productoEntity.getPrecio());
		productoDTO.setCategoria(productoEntity.getCategoria());
		productoDTO.setRestaurante(productoEntity.getRestaurante());
		return productoDTO;
	}

}