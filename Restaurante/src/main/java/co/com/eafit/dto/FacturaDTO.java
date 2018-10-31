package co.com.eafit.dto;

public class FacturaDTO {

	private int idPedido;

	public FacturaDTO(int idPedido) {
		super();
		this.idPedido = idPedido;
	}

	public FacturaDTO() {
		super();
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	
}
