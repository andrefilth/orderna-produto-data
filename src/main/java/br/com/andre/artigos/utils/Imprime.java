package br.com.andre.artigos.utils;

import java.util.List;

import br.com.andre.artigos.Produto;

public class Imprime {
	
	public void imprimeLista(List<Produto> list, String desc) {
		for (Produto produto : list) {
		
			System.out.println(desc + ' '+ produto);
		}
		System.out.println("***************************************************************************");
	}

}
