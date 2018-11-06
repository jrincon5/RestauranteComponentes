package co.com.eafit.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pedido")
public class PedidoEntity {

	@Id
	@GeneratedValue
	@Column(name = "id_pedido")
	private int idProducto;
	@Column(name = "tiempo_espera")
	private int tiempoEspera;
	@Column(name = "productos")
	private String productos;	
	@Column(name = "total")
	private double total;
	@Column(name = "restaurante")
	private String restaurante;
	
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public int getTiempoEspera() {
		return tiempoEspera;
	}
	public void setTiempoEspera(int tiempoEspera) {
		this.tiempoEspera = tiempoEspera;
	}
	public String getProductos() {
		return productos;
	}
	public void setProductos(String productos) {
		this.productos = productos;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getRestaurante() {
		return restaurante;
	}
	public void setRestaurante(String restaurante) {
		this.restaurante = restaurante;
	}
}

