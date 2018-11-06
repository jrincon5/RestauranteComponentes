package co.com.eafit.utilidad.mapeo.producto;

import co.com.eafit.dto.ProductoDTO;
import co.com.eafit.entidad.ProductoEntity;

public interface IProductoMapper {
	public ProductoEntity dtoProductoAEntity(ProductoDTO productoDTO);
	public ProductoDTO entityProductoADto(ProductoEntity productoEntity);
}
