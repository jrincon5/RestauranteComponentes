package co.com.eafit.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="pago")
public class PagoEntity {

	@Id
	@GeneratedValue
	@Column(name = "id_pago")
	private int idPago;
	@Column(name = "valor")
	private double valor;
	@Column(name = "tipo_pago")
	private String tipoPago;
	@Column(name = "estado")
	private String estado;
	
	public PagoEntity() {
		super();
	}

	public int getIdPago() {
		return idPago;
	}

	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
}

