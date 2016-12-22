package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class LoginDAO {
	public boolean login(String username, String password){
		Connection conn  = ConnectionDAO.getConnection(); 
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps = conn.prepareStatement("Select * from dbo.usuario where Nombre=? and Clave=?");
			ps.setString(1, username);
			ps.setString(2, password);
			rs=ps.executeQuery();
			if(rs.next()){
				return true;
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		} 
		return false;
	} 
}
