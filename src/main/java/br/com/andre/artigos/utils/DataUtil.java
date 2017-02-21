package br.com.andre.artigos.utils;

import java.util.Calendar;
import java.util.Date;

public class DataUtil {


	public  Date criaData(int ano, int mes, int dia) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(ano, mes, dia);
		return calendar.getTime();
	}

}
