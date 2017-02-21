package br.com.andre.test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import br.com.andre.Ordena;
import br.com.andre.artigos.Produto;
import br.com.andre.artigos.constantes.Constantes;
import br.com.andre.artigos.utils.DataUtil;
import br.com.andre.artigos.utils.Imprime;
import br.com.andre.artigos.utils.OrdernaCarrinhoData;
import br.com.andre.artigos.utils.OrdernaCarrinhoProduto;

public class OrdernaTest {

	public static void main(String[] args) {
		DataUtil util = new DataUtil();
		// cria os produtos
		Produto produto1 = new Produto("TV3", 40, util.criaData(2016, 2, 2));
		Produto produto2 = new Produto("Geladeira", 30, util.criaData(2016, 2, 3));
		Produto produto3 = new Produto("Fogão", 21, util.criaData(2016, 2, 4));
		Produto produto4 = new Produto("Fogão", 25, util.criaData(2017, 3, 4));
		Produto produto5 = new Produto("Fogão", 55, util.criaData(2017, 4, 4));
		Produto produto6 = new Produto("Fogão", 66, util.criaData(2018, 5, 4));

		// adiciona os produtos em uma lista
		List<Produto> list = Arrays.asList(produto1, produto2, produto3, produto4, produto5, produto6);
		Ordena ordena = new Ordena();
		Imprime print = new Imprime();
		String desc = "Lista desordenada";
		print.imprimeLista(list, desc);

		ordena.ordernaDados(list, Constantes.DATA);
		print.imprimeLista(list, "Lista ordernado por data");

		ordena.ordernaDados(list, Constantes.PRODUTO);
		print.imprimeLista(list, "Lista ordernado por produto");
	}

}
