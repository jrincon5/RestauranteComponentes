package co.com.eafit.dto;

public class ProductoDTO {

	private String nombre;
	private double precio;
	private String categoria;
	private String restaurante;
	
	public ProductoDTO(String nombre,double precio,String categoria,String restaurante) {
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
		this.restaurante = restaurante;
	}
	
	public ProductoDTO() {

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
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getRestaurante() {
		return restaurante;
	}
	public void setRestaurante(String restaurante) {
		this.restaurante = restaurante;
	}
}