package co.com.eafit.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="factura")
public class FacturaEntity {

	@Id
	@GeneratedValue
	@Column(name = "id_factura")
	private int idFactura;
	@Column(name = "productos")
	private String productos;
	@Column(name = "total")
	private double total;
	@Column(name = "propina")
	private double propina;
	@Column(name = "referenciaPago")
	private int referenciaPago;
	
	public FacturaEntity() {
		super();
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
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