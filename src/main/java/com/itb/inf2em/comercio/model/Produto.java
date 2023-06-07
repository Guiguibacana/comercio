package com.itb.inf2em.comercio.model;

public class Produto {

	private Long id;
	private String nome;
	private String descricao;
	private String codigoBarras;
	private double preco;
	
	// publi: Acesso liberado para todas as classes.
	
	
	// private: Acesso liberado apenas dentro as própria classe, ou seja, apenas os métodos da referida classe tem acesso.
	
	
	// Métodos Setters's - Atribuir dados aos atributos
	public void setId (Long id) {
		this.id = id;
	}
	
	public Long getId(){
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}
}
