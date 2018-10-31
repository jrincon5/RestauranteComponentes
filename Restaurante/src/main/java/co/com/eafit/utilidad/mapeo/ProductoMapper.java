package co.com.eafit.utilidad.mapeo;

import org.springframework.stereotype.Component;

import co.com.eafit.dto.ProductoDTO;
import co.com.eafit.entidad.ProductoEntity;

@Component("productoMapper")
public class ProductoMapper {

	public ProductoEntity dtoProductoAEntity(ProductoDTO productoDTO) {
		ProductoEntity productoEntity = new ProductoEntity();
		productoEntity.setNombre(productoDTO.getNombre());
		productoEntity.setIdMenu(productoDTO.getIdMenu());
		productoEntity.setPrecio(productoDTO.getPrecio());
		productoEntity.setCategoriaProducto(productoDTO.getCategoriaProducto());
		return productoEntity;
	}

}