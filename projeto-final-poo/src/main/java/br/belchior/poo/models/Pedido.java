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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (numero ^ (numero >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	
}
