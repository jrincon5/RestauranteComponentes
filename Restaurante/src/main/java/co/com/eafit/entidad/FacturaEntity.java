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
	@Column(name = "idPedido")
	private int idPedido;
	
	public FacturaEntity() {
		super();
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	
	
}

