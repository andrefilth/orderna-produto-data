package br.com.andre.artigos.utils;

import java.util.Comparator;

import br.com.andre.artigos.Produto;

public class OrdernaCarrinhoData implements Comparator<Produto> {

	public int compare(Produto produto, Produto outroProduto) {
		// TODO Auto-generated method stub
		return produto.getData().compareTo(outroProduto.getData());
	}

}
