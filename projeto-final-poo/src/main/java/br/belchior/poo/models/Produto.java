package br.belchior.poo.models;

import br.belchior.poo.enums.Moeda;

public class Produto {
	private int codigo;
	private String nome;
	private Categoria categoria;
	private double preco;
	private Moeda moeda;
	private double imposto;
	
	public double totalProduto() {
		return preco + preco * imposto;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Moeda getMoeda() {
		return moeda;
	}
	
	public void setMoeda(Moeda moeda) {
		this.moeda = moeda;
	}
	
	public double getImposto() {
		return imposto;
	}
	
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
}
