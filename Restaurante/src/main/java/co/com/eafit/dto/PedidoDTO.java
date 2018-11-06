package co.com.eafit.dto;

import java.util.List;


public class PedidoDTO {

	private int tiempoEspera; 
	private List<ProductoDTO> productos;
	private double total;
	private String restaurante;
			
	public PedidoDTO(int tiempoEspera, List<ProductoDTO> productos, double total, String restaurante) {
		super();
		this.tiempoEspera = tiempoEspera;
		this.productos = productos;
		this.total = total;
		this.restaurante = restaurante;
	}

	public PedidoDTO() {
		super();
	}
	public int getTiempoEspera() {
		return tiempoEspera;
	}
	public void setTiempoEspera(int tiempoEspera) {
		this.tiempoEspera = tiempoEspera;
	}	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public List<ProductoDTO> getProductos() {
		return productos;
	}
	public void setProductos(List<ProductoDTO> productos) {
		this.productos = productos;
	}
	public String getRestaurante() {
		return restaurante;
	}
	public void setRestaurante(String restaurante) {
		this.restaurante = restaurante;
	}	
}