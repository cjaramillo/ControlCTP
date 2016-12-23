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
	private String[] selectedColors;
	
	
	public String[] getSelectedColors() {
		return selectedColors;
	}

	public void setSelectedColors(String[] selectedColors) {
		this.selectedColors = selectedColors;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public List<String> completeText(String query) {
		List<String> results = new ArrayList<String>();
        for(Cliente tmpCliente : this.clientes){
        	if (tmpCliente.getNombre().toUpperCase().startsWith(query.toUpperCase())){
        		results.add(tmpCliente.getNombre());
        	}
        }
        return results;
    }
}
