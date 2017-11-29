package br.belchior.poo.models;

public class ItemPedido {
	private int numero;
	private int quantidade;
	private Produto produto;
	
	public double totalItem() {
		return quantidade * produto.totalProduto();
	}
	
	public double totalItemImposto() {
		return quantidade * produto.getImposto();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
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
		ItemPedido other = (ItemPedido) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	
}
