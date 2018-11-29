package br.com.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class )
@CucumberOptions(
		features = "src/test/resources/features/InserirConta.feature",
		glue = "br.com.steps",
		tags = "~@ignore",// para ignorar algum cenario só usar o comando 
		plugin = {"pretty","html:target/report-html","json:target/report.json"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,//Organiza as funcionalidades com o formato CAMELCASE
		dryRun = false,// se estiver true escapa todos os cenarios
		strict = false // se estiver true falha os testes caso falte um step
		)
public class Runner {

}
