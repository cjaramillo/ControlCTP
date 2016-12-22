package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDAO {
	private static Connection conn;
	public static synchronized Connection getConnection(){
		try {
			if (conn==null){
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Graphicsource", "fer", "05043001");
			}
		} catch(ClassNotFoundException|SQLException ex){
			System.out.println(ex.getMessage());
		}	
		return conn;
	}
}
