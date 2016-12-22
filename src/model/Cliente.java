package model;

public class Cliente {
	
	public Cliente(){}
	public Cliente(int idCliente, String ruc, String nombre) {
		super();
		this.idCliente = idCliente;
		this.ruc = ruc;
		this.nombre = nombre;
	}
	private int idCliente;
	private String ruc;
	private String nombre;
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}
