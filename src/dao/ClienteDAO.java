package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Cliente;

import java.util.ArrayList;

public class ClienteDAO {
	Connection conn = ConnectionDAO.getConnection();

	public List<Cliente> getAll(){
		List<Cliente> clientes = new ArrayList<Cliente>();
		Cliente tmpCliente = new Cliente();
		try {
			PreparedStatement ps = conn.prepareStatement("select idCliente, ruc, nombre from dbo.Cliente where DesconCliente=0");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				tmpCliente.setIdCliente(rs.getInt("idCliente"));
				tmpCliente.setRuc(rs.getString("ruc"));
				tmpCliente.setNombre(rs.getString("nombre"));
				clientes.add(tmpCliente);
				tmpCliente = new Cliente();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
	}
	
	public Cliente getById(int idCliente){
		Cliente tmpCliente = new Cliente();
		try {
			PreparedStatement ps = conn.prepareStatement("select idCliente, ruc, nombre from dbo.Cliente where idCliente=?");
			ps.setInt(1, idCliente);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				tmpCliente.setIdCliente(rs.getInt("idCliente"));
				tmpCliente.setRuc(rs.getString("ruc"));
				tmpCliente.setNombre(rs.getString("nombre"));
				tmpCliente = new Cliente();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tmpCliente;		
	}
}
