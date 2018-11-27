package br.com.steps;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
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
	    
		String ola = web.findElement(By.cssSelector(".alert.alert-success")).getText();
		assertEquals(ola,"Bem vindo, Teste!" );
		resetBotao();
	}

	@Quando("^seleciono Contas$")
	public void selecionoContas() throws Throwable {
		web.findElement(By.linkText("Contas")).click();
	 
	}

	@Quando("^seleciono Adicionar$")
	public void selecionoAdicionar() throws Throwable {
		web.findElement(By.linkText("Adicionar")).click();
	 
	}

	@Quando("^informo a conta \"([^\"]*)\"$")
	public void informoAConta(String arg1) throws Throwable {
	    
		web.findElement(By.id("nome")).sendKeys(arg1);
	}

	@Quando("^seleciono Salvar$")
	public void selecionoSalvar() throws Throwable {
	    
		web.findElement(By.tagName("button")).click();
	}

	@Então("^a conta é inserida com sucesso$")
	public void aContaÉInseridaComSucesso() throws Throwable {
	    
	 //<div class="alert alert-success" role="alert">Conta adicionada com sucesso!</div>
		
		String sus = web.findElement(By.xpath("//div[@class='alert alert-success']")).getText();	
		assertEquals(sus, "Conta adicionada com sucesso!");
	
	}

	@Então("^sou notificar que o nome da conta é obrigatório$")
	public void souNotificarQueONomeDaContaÉObrigatório() throws Throwable {
		
		String alert = web.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();	
		assertEquals(alert, "Informe o nome da conta");    
	}

	@Então("^sou notificado que já existe uma conta com esse nome$")
	public void souNotificadoQueJáExisteUmaContaComEsseNome() throws Throwable {
		
		String aler = web.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();	
		assertEquals(aler, "Já existe uma conta com esse nome!");
		
	}
    public void resetBotao() {
    	web.findElement(By.xpath("//a[contains(text(),'reset')]")).click();
    }
    
    @After(order = 1)
    public void screenShot(Scenario cenario) {
    	File file = ((TakesScreenshot)web).getScreenshotAs(	OutputType.FILE);
    	try {
			FileUtils.copyFile(file, new File("target/screenshot/"+cenario.getId()+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	@After(order = 0)
	public void fecharBrowser() {
		web.quit();
	}
	
}
