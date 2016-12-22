package model;

public class Orden {
	private int idOrden;
	private String numeroOrden;
	private Cliente cliente;
	private String numeroGuia;
	
	public Orden(int idOrden, String numeroOrden, Cliente cliente, String numeroGuia) {
		super();
		this.idOrden = idOrden;
		this.numeroOrden = numeroOrden;
		this.cliente = cliente;
		this.numeroGuia = numeroGuia;
	}
	public int getIdOrden() {
		return idOrden;
	}
	public void setIdOrden(int idOrden) {
		this.idOrden = idOrden;
	}
	public String getNumeroOrden() {
		return numeroOrden;
	}
	public void setNumeroOrden(String numeroOrden) {
		this.numeroOrden = numeroOrden;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getNumeroGuia() {
		return numeroGuia;
	}
	public void setNumeroGuia(String numeroGuia) {
		this.numeroGuia = numeroGuia;
	}
	

}
