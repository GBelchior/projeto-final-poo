package br.belchior.poo.managedbeam;

import java.util.List;
import java.util.TreeSet;

import javax.faces.bean.ManagedBean;
import br.belchior.poo.data.DataStorage;
import br.belchior.poo.enums.Status;
import br.belchior.poo.models.Cliente;

@ManagedBean
public class ClienteMB {
	
	private Cliente _cliente = new Cliente();

	public Cliente getCliente() {
		return _cliente;
	}
	
	public TreeSet<Cliente> getClientes() {
		return DataStorage.getClientes();
	}
	
	public Status[] getStatuses() {
		return Status.values();
	}
	
	public void addCliente() {
		_cliente.setCodigo(DataStorage.getClientes().size() == 0 ? 1 : DataStorage.getClientes().last().getCodigo() + 1);
		DataStorage.getClientes().add(_cliente);
		_cliente = new Cliente();
	}
	
	public void removeCliente(Cliente cliente) {
		DataStorage.getClientes().remove(cliente);
	}
	
}
