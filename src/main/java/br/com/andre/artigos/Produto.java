package br.com.andre.artigos;

import java.util.Date;

public class Produto {

	private String nome;
	
	private int quantidade;
	
	private Date data;

	public Produto(String nome, int quantidade,Date date) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.data = date;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return " [nome=" + nome + ", quantidade=" + quantidade + ", data=" + data + "]";
	}

	
	
}
