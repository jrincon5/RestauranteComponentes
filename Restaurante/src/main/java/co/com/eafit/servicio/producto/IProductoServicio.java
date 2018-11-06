package co.com.eafit.servicio.producto;

import java.util.List;

import co.com.eafit.dto.ProductoDTO;

public interface IProductoServicio {
	public void agregarProducto(ProductoDTO productoDTO);
	public List<ProductoDTO> listarProducto();
	public void eliminarProducto(ProductoDTO productoDTO);
}
