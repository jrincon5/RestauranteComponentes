package co.com.eafit.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="menu")
public class MenuEntity {

	@Id
	@GeneratedValue
	@Column(name = "id_menu")
	private int idMenu;
	@Column(name = "id_restaurante")
	private int idRestaurante;
	@Column(name = "categoria")
	private String categoria;	
	
	public MenuEntity() {
		super();
	}
	
	public int getIdMenu() {
		return idMenu;
	}
	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}
	public int getIdRestaurante() {
		return idRestaurante;
	}
	public void setIdRestaurante(int idRestaurante) {
		this.idRestaurante = idRestaurante;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
