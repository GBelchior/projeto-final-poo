package br.belchior.poo.data;

import java.util.ArrayList;
import java.util.List;

import br.belchior.poo.models.*;

public final class DataStorage {
	private static List<Cliente> _clientes = new ArrayList<Cliente>();
	private static List<Pedido> _pedidos = new ArrayList<Pedido>();
	private static List<ItemPedido> _itensPedido = new ArrayList<ItemPedido>();
	private static List<Categoria> _categorias = new ArrayList<Categoria>();
	private static List<ProdutoExportacao> _produtosExportacao = new ArrayList<ProdutoExportacao>();
	private static List<ProdutoMercadoInterno> _produtosMercadoInterno = new ArrayList<ProdutoMercadoInterno>();

	private DataStorage() {
		
	}
	
	public static List<Cliente> getClientes() {
		return _clientes;
	}

	public static void setClientes(List<Cliente> clientes) {
		_clientes = clientes;
	}

	public static List<Pedido> getPedidos() {
		return _pedidos;
	}

	public static void setPedidos(List<Pedido> pedidos) {
		_pedidos = pedidos;
	}

	public static List<ItemPedido> getItensPedido() {
		return _itensPedido;
	}

	public static void setItensPedido(List<ItemPedido> itensPedido) {
		_itensPedido = itensPedido;
	}

	public static List<Categoria> getCategorias() {
		return _categorias;
	}

	public static void setCategorias(List<Categoria> categorias) {
		_categorias = categorias;
	}

	public static List<ProdutoExportacao> getProdutosExportacao() {
		return _produtosExportacao;
	}

	public static void setProdutosExportacao(List<ProdutoExportacao> produtosExportacao) {
		_produtosExportacao = produtosExportacao;
	}

	public static List<ProdutoMercadoInterno> getProdutosMercadoInterno() {
		return _produtosMercadoInterno;
	}

	public static void setProdutosMercadoInterno(List<ProdutoMercadoInterno> produtosMercadoInterno) {
		_produtosMercadoInterno = produtosMercadoInterno;
	}
}
