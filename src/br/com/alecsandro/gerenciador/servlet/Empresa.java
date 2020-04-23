package br.com.alecsandro.gerenciador.servlet;

import java.util.Date;

public class Empresa {

	private Long id;
	private String nome;
	private Date data = new Date();

	public Empresa() {
	}

	public Empresa(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Empresa(String nome, Date data) {
		this.nome = nome;
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
