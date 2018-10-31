package co.com.eafit.dto;

import java.util.Date;


public class PedidoDTO {

	private Date tiempoEspera; 
	private String productos;
	private int total;
	
	public PedidoDTO(Date tiempoEspera, String productos, int total) {
		super();
		this.tiempoEspera = tiempoEspera;
		this.productos = productos;
		this.total = total;
	}
	
	public PedidoDTO() {
		super();
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
