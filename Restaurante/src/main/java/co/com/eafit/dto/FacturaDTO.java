package co.com.eafit.dto;

import java.util.List;

public class FacturaDTO {

	List<ProductoDTO> productos;
	double total;
	double propina;
	int referenciaPago;
	
	public FacturaDTO(List<ProductoDTO> productos, double total, double propina, int referenciaPago) {
		super();
		this.productos = productos;
		this.total = total;
		this.propina = propina;
		this.referenciaPago = referenciaPago;
	}	

	public FacturaDTO() {
		super();
	}

	public List<ProductoDTO> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoDTO> productos) {
		this.productos = productos;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getPropina() {
		return propina;
	}

	public void setPropina(double propina) {
		this.propina = propina;
	}

	public int getReferenciaPago() {
		return referenciaPago;
	}

	public void setReferenciaPago(int referenciaPago) {
		this.referenciaPago = referenciaPago;
	}	
	
}