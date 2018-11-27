package br.com.steps;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import br.com.helpers.DataConverte;
import cucumber.api.Transform;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AprenderCucumber {
	
	
	 ///////////////////////////////////////////////////////////////////////////////////////////////
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////
	private int contador = 0;

	
	@Dado("^que o valor é (\\d+)$")
	public void que_o_valor_é(int numero) throws Throwable {
		contador = numero;
	}

	@Quando("^eu incrementar em (\\d+)$")
	public void eu_incrementar_em(int incremento) throws Throwable {
		contador = contador + incremento;
		
	}

	@Entao("^o valor do contador sera (\\d+)$")
	public void o_valor_do_contador_sera(int arg1) throws Throwable {
	
		//Assert.assertTrue(arg1 == contador);	
		Assert.assertEquals(arg1,contador);	
		
			
		
		//throw new RuntimeException();
	}
	
	
	
	Date entrega = new Date();
	
	@Dado("^que o prazo eh dia (.*)$")
	public void queOPrazoEhDia(@Transform(DataConverte.class)Date date) throws Throwable {
		
	   entrega = date;
	 System.out.println(entrega);
	}

	@Quando("^a entrega atrasar em (\\d+) (dia|dias|meses|mes)$")
	public void aEntregaAtrasarEmDias(int data , String tempo) throws Throwable {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		
		if(tempo.equals("dia")||tempo.equals("dias")) {
		cal.add(Calendar.DAY_OF_MONTH, data);
		}
		if(tempo.equals("mes")||tempo.equals("meses")) {
			cal.add(Calendar.MONTH, data);
		}
		entrega = cal.getTime();
			 
		
	}
	
	@Entao("^a entrega sera efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSeraEfetuadaEm(String dataEntrega) throws Throwable {
		DateFormat formatada = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = formatada.format(entrega);
		Assert.assertEquals(dataEntrega, dataFormatada);
		
	}




}
