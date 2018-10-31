package co.com.eafit.dto;

public class ProductoDTO {

	private String nombre;
	private int idMenu;
	private double precio;
	private String categoriaProducto;

	
	public ProductoDTO(String nombre,int idMenu, double precio,String categoriaProducto) {
		this.nombre = nombre;
		this.idMenu = idMenu;
		this.precio = precio;
		this.categoriaProducto = categoriaProducto;
	}
	
	public ProductoDTO() {

	}
	
	public int getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}

	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCategoriaProducto() {
		return categoriaProducto;
	}
	public void setCategoriaProducto(String categoriaProducto) {
		this.categoriaProducto = categoriaProducto;
	}
}
