package br.belchior.poo.data;

import java.util.TreeSet;

import br.belchior.poo.models.*;

public final class DataStorage {
	private static TreeSet<Cliente> _clientes = new TreeSet<Cliente>((c1, c2) -> Integer.compare(c1.getCodigo(), c2.getCodigo()));
	private static TreeSet<Pedido> _pedidos = new TreeSet<Pedido>((c1, c2) -> Long.compare(c1.getNumero(), c2.getNumero()));
	private static TreeSet<ItemPedido> _itensPedido = new TreeSet<ItemPedido>((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
	private static TreeSet<Categoria> _categorias = new TreeSet<Categoria>((c1, c2) -> c1.getDescricao().compareTo(c2.getDescricao()));
	private static TreeSet<ProdutoExportacao> _produtosExportacao = new TreeSet<ProdutoExportacao>((c1, c2) -> Integer.compare(c1.getCodigo(), c2.getCodigo()));
	private static TreeSet<ProdutoMercadoInterno> _produtosMercadoInterno = new TreeSet<ProdutoMercadoInterno>((c1, c2) -> Integer.compare(c1.getCodigo(), c2.getCodigo()));

	private DataStorage() {
		
	}
	
	public static TreeSet<Cliente> getClientes() {
		return _clientes;
	}

	public static void setClientes(TreeSet<Cliente> clientes) {
		_clientes = clientes;
	}

	public static TreeSet<Pedido> getPedidos() {
		return _pedidos;
	}

	public static void setPedidos(TreeSet<Pedido> pedidos) {
		_pedidos = pedidos;
	}

	public static TreeSet<ItemPedido> getItensPedido() {
		return _itensPedido;
	}

	public static void setItensPedido(TreeSet<ItemPedido> itensPedido) {
		_itensPedido = itensPedido;
	}

	public static TreeSet<Categoria> getCategorias() {
		return _categorias;
	}

	public static void setCategorias(TreeSet<Categoria> categorias) {
		_categorias = categorias;
	}

	public static TreeSet<ProdutoExportacao> getProdutosExportacao() {
		return _produtosExportacao;
	}

	public static void setProdutosExportacao(TreeSet<ProdutoExportacao> produtosExportacao) {
		_produtosExportacao = produtosExportacao;
	}

	public static TreeSet<ProdutoMercadoInterno> getProdutosMercadoInterno() {
		return _produtosMercadoInterno;
	}

	public static void setProdutosMercadoInterno(TreeSet<ProdutoMercadoInterno> produtosMercadoInterno) {
		_produtosMercadoInterno = produtosMercadoInterno;
	}
}
