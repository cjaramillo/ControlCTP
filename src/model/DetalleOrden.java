package model;

public class DetalleOrden {
	private int idDetalleOrden;
	private String nombreArchivo;
	private boolean c;
	private boolean y;
	private boolean m;
	private boolean k;
	private Articulo articulo;
	private float cantidad;
	
	public DetalleOrden(int idDetalleOrden, String nombreArchivo, boolean c, boolean y, boolean m, boolean k,
			Articulo articulo, float cantidad) {
		super();
		this.idDetalleOrden = idDetalleOrden;
		this.nombreArchivo = nombreArchivo;
		this.c = c;
		this.y = y;
		this.m = m;
		this.k = k;
		this.articulo = articulo;
		this.cantidad = cantidad;
	}
	public int getIdDetalleOrden() {
		return idDetalleOrden;
	}
	public void setIdDetalleOrden(int idDetalleOrden) {
		this.idDetalleOrden = idDetalleOrden;
	}
	public String getNombreArchivo() {
		return nombreArchivo;
	}
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	public boolean isC() {
		return c;
	}
	public void setC(boolean c) {
		this.c = c;
	}
	public boolean isY() {
		return y;
	}
	public void setY(boolean y) {
		this.y = y;
	}
	public boolean isM() {
		return m;
	}
	public void setM(boolean m) {
		this.m = m;
	}
	public boolean isK() {
		return k;
	}
	public void setK(boolean k) {
		this.k = k;
	}
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	

}
