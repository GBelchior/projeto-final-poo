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

}
