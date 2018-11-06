package co.com.eafit.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="restaurante")
public class RestauranteEntity {

	@Id
	@GeneratedValue
	@Column(name = "id_restaurante")
	private int idRestaurante;
	@Column(name = "tipo_documento")
	private String tipoDocumento;
	@Column(name = "numero_documento")
	private String numeroDocumento;
	@Column(name = "nombre")
	private String nombre;	
	@Column(name = "tipo_restaurante")
	private String tipoRestaurante;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "direccion")
	private String direccion;
	public RestauranteEntity() {
		super();
	}
	public int getIdRestaurante() {
		return idRestaurante;
	}
	public void setIdRestaurante(int idRestaurante) {
		this.idRestaurante = idRestaurante;
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
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
}
