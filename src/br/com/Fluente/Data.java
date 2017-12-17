package br.com.Fluente;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data {
	Date data;
	public Data(String dataStr) {
		try {
			data = new SimpleDateFormat("dd/MM/yyyy").parse(dataStr);
		} catch (ParseException e) {
			throw new IllegalArgumentException(e);
		}
		
	}
	@Override
	public String toString() {
		return new SimpleDateFormat("dd/MM/yyyy").format(data);
	}
	public Data avancarDias(int qtd) {
		Calendar c = Calendar.getInstance();
		c.setTime(data);
		c.add(Calendar.DATE, qtd);
		data = c.getTime();
		return this;
	}
	
}
