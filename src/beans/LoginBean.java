package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.LoginDAO;

@ManagedBean
@SessionScoped
public class LoginBean {
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String authUser(){
		LoginDAO ldao = new LoginDAO();
		if (ldao.login(username, password)){
			return "main";
		}else{
			this.username=this.password="";
			return "login";
		}
	}
}
