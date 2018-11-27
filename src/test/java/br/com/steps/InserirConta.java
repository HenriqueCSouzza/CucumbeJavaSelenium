package br.com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

	
public class InserirConta {
	WebDriver web = new ChromeDriver();
	
	@Dado("^que estou acessando a aplicação$")
	public void queEstouAcessandoAAplicação() throws Throwable {
	    web.get("https://srbarriga.herokuapp.com/login");
	  
	}

	@Quando("^informo o usuário \"([^\"]*)\"$")
	public void informoOUsuário(String arg1) throws Throwable {
	    web.findElement(By.id("email")).sendKeys(arg1);
	 
	}

	@Quando("^a senha \"([^\"]*)\"$")
	public void aSenha(String arg1) throws Throwable {
		 web.findElement(By.id("senha")).sendKeys(arg1);
	 
	}

	@Quando("^seleciono entrar$")
	public void selecionoEntrar() throws Throwable {
	    
		web.findElement(By.cssSelector(".btn.btn-primary")).click();
	}

	@Então("^visualizo a página inicial$")
	public void visualizoAPáginaInicial() throws Throwable {
	    
	 
	}

	@Quando("^seleciono Contas$")
	public void selecionoContas() throws Throwable {
	    
	 
	}

	@Quando("^seleciono Adicionar$")
	public void selecionoAdicionar() throws Throwable {
	    
	 
	}

	@Quando("^informo a conta \"([^\"]*)\"$")
	public void informoAConta(String arg1) throws Throwable {
	    
	 
	}

	@Quando("^seleciono Salvar$")
	public void selecionoSalvar() throws Throwable {
	    
	 
	}

	@Então("^a conta é inserida com sucesso$")
	public void aContaÉInseridaComSucesso() throws Throwable {
	    
	 
	}

	@Então("^sou notificar que o nome da conta é obrigatório$")
	public void souNotificarQueONomeDaContaÉObrigatório() throws Throwable {
	    
	 
	}

	@Então("^sou notificado que já existe uma conta com esse nome$")
	public void souNotificadoQueJáExisteUmaContaComEsseNome() throws Throwable {

	 
	}

	
}
