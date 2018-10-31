package co.com.eafit.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;

@Entity
@Table(name="pedido")
public class PedidoEntity {

	@Id
	@GeneratedValue
	@Column(name = "id_pedido")
	private int idProducto;
	@Column(name = "tiempoEspera")
	private Date tiempoEspera;
	@Column(name = "productos")
	private String productos;	
	@Column(name = "total")
	private int total;
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public Date getTiempoEspera() {
		return tiempoEspera;
	}
	public void setTiempoEspera(Date tiempoEspera) {
		this.tiempoEspera = tiempoEspera;
	}
	public String getProductos() {
		return productos;
	}
	public void setProductos(String productos) {
		this.productos = productos;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	
}

