package co.com.eafit.dto;

public class RestauranteDTO {

	private String nombre;	
	private String tipoRestaurante;
	private String descripcion;
	private String telefono;
	private String direccion;
		
	public RestauranteDTO(String nombre, String tipoRestaurante, String descripcion, String telefono, String direccion) {
		super();
		this.nombre = nombre;
		this.tipoRestaurante = tipoRestaurante;
		this.descripcion = descripcion;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	public RestauranteDTO() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoRestaurante() {
		return tipoRestaurante;
	}
	public void setTipoRestaurante(String tipoRestaurante) {
		this.tipoRestaurante = tipoRestaurante;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
