package model;

public class Usuario {
	private int idUsuario;
	private String username;
	
	public Usuario(int idUsuario, String username) {
		super();
		this.idUsuario = idUsuario;
		this.username = username;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

}
