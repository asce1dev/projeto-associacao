package com.associacao.projetocliente.simples;

public class Cliente {

	private String nome;
	private String cpf;
	private String senhaGov;
	
	public Cliente(String nome, String cpf, String senhaGov) {
		this.nome = nome;
		this.cpf = cpf;
		this.senhaGov = senhaGov;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenhaGov() {
		return senhaGov;
	}

	public void setSenhaGov(String senhaGov) {
		this.senhaGov = senhaGov;
	}
	
}
