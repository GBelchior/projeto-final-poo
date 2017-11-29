package br.belchior.poo.data;

import java.util.List;

import br.belchior.poo.models.*;

public class DataStorage {
	private List<Cliente> clientes;
	private List<Pedido> pedidos;
	private List<ItemPedido> itensPedido;
	private List<Categoria> categorias;
	private List<ProdutoExportacao> produtosExportacao;
	private List<ProdutoMercadoInterno> produtosMercadoInterno;

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public List<ItemPedido> getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(List<ItemPedido> itensPedido) {
		this.itensPedido = itensPedido;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public List<ProdutoExportacao> getProdutosExportacao() {
		return produtosExportacao;
	}

	public void setProdutosExportacao(List<ProdutoExportacao> produtosExportacao) {
		this.produtosExportacao = produtosExportacao;
	}

	public List<ProdutoMercadoInterno> getProdutosMercadoInterno() {
		return produtosMercadoInterno;
	}

	public void setProdutosMercadoInterno(List<ProdutoMercadoInterno> produtosMercadoInterno) {
		this.produtosMercadoInterno = produtosMercadoInterno;
	}
}
