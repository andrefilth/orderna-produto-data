package br.com.andre;

import java.util.Collections;
import java.util.List;

import br.com.andre.artigos.Produto;
import br.com.andre.artigos.constantes.Constantes;
import br.com.andre.artigos.utils.OrdernaCarrinhoData;
import br.com.andre.artigos.utils.OrdernaCarrinhoProduto;

public class Ordena {

	
	public void ordernaDados(List<Produto> listProdutos, Constantes order) {

		switch (order) {
		case PRODUTO:

			Collections.sort(listProdutos, new OrdernaCarrinhoProduto());
			break;

		case DATA:
			Collections.sort(listProdutos, new OrdernaCarrinhoData());
			break;
		}
	}	
	
	
}
