package model;

public class Articulo {
	private int idArticulo;
	private String codigo;
	private String articulo;
	private String descripcion;
	private String pvp;
	
	public Articulo(int idArticulo, String codigo, String articulo, String descripcion, String pvp) {
		super();
		this.idArticulo = idArticulo;
		this.codigo = codigo;
		this.articulo = articulo;
		this.descripcion = descripcion;
		this.pvp = pvp;
	}
	
	public int getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPvp() {
		return pvp;
	}
	public void setPvp(String pvp) {
		this.pvp = pvp;
	}
	
	

}
