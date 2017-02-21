package br.com.andre.artigos.utils;

import java.util.Comparator;

import br.com.andre.artigos.Produto;

public class OrdernaCarrinhoProduto implements Comparator<Produto> {
	public int compare(Produto produto, Produto outroProduto) {
		return produto.getNome().compareTo(outroProduto.getNome()); 
	}

	
}
