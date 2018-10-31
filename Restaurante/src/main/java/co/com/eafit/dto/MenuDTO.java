package co.com.eafit.dto;

public class MenuDTO {
	
	private int idRestaurante;
	private String categoria;
	
	public MenuDTO (int idRestaurante,String categoria) {
		super();
		this.idRestaurante = idRestaurante;
		this.categoria = categoria;		
	}
	
	public MenuDTO() {
		super();
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public int getIdRestaurante() {
		return idRestaurante;
	}
	
	public void setIdRestaurante(int idRestaurante) {
		this.idRestaurante = idRestaurante;
	}

}
