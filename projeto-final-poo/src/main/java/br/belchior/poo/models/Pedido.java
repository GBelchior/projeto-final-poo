package br.belchior.poo.models;

import java.util.Date;
import java.util.List;

public class Pedido {
	private long numero;
	private Date data;
	private List<ItemPedido> itens;
	private Cliente cliente;
	
	public double totalPedido() {
		return itens.stream().mapToDouble(i -> i.totalItem()).sum();
	}
	
	public double totalImposto() {
		return itens.stream().mapToDouble(i -> i.totalItemImposto()).sum();
	}
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public List<ItemPedido> getItens() {
		return itens;
	}
	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
