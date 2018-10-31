package co.com.eafit.dto;

public class PagoDTO {

	private int idPedido;
	private double valor;
	private String tipoPago;
	private String estado;
	
	public PagoDTO(int idPedido, double valor, String tipoPago, String estado) {
		super();
		this.idPedido = idPedido;
		this.valor = valor;
		this.tipoPago = tipoPago;
		this.estado = estado;
	}
	public PagoDTO() {
		super();
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
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
