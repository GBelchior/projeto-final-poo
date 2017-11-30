package br.belchior.poo.managedbeam;

import java.util.List;
import java.util.TreeSet;

import javax.faces.bean.ManagedBean;
import br.belchior.poo.data.DataStorage;
import br.belchior.poo.models.Categoria;

@ManagedBean
public class CategoriaMB {
	
	private Categoria _categoria = new Categoria();

	public Categoria getCategoria() {
		return _categoria;
	}
	
	public TreeSet<Categoria> getCategorias() {
		return DataStorage.getCategorias();
	}
	
	public void addCategoria() {
		DataStorage.getCategorias().add(_categoria);
		_categoria = new Categoria();
	}
	
	public void removeCategoria(Categoria categoria) {
		DataStorage.getCategorias().remove(categoria);
	}
	
}
