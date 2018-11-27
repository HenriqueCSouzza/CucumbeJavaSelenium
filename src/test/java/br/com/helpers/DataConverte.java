package br.com.helpers;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import cucumber.api.Transformer;

public class DataConverte extends Transformer<Date> {

	@Override
	public Date transform(String value) {
		DateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
		try{
			Date formatada = formatar.parse(value);
			return formatada;
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
		
	}

}
