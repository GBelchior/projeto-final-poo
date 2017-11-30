package br.belchior.poo.models;

import java.util.List;

import br.belchior.poo.enums.Status;

public class Cliente {
	private int codigo;
	private String nome;
	private String endereco;
	private String telefone;
	private Status status;
	private double limite;
	private List<Pedido> pedidos;
	
	public Cliente() { }
	
	public Cliente(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
}
