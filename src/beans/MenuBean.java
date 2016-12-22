package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import dao.ClienteDAO;
import model.Cliente;


@ManagedBean
public class MenuBean {
	
	List<Cliente> clientes = new ClienteDAO().getAll();
	private String nombreCliente;

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public List<String> completeText(String query) {
        System.out.println("Hola desde completeTxt");
		List<String> results = new ArrayList<String>();
        for(Cliente tmpCliente : this.clientes){
        	if (tmpCliente.getNombre().toUpperCase().startsWith(query.toUpperCase())){
        		results.add(tmpCliente.getNombre());
        	}
        }
        return results;
    }
}
