package br.com.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class )
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "br.com.steps",
		//tags = "",// para ignorar algum cenario só usar o comando ~ignore
		plugin = "pretty",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,//Organiza as funcionalidades com o formato CAMELCASE
		dryRun = false,// se estiver true escapa todos os cenarios
		strict = false // se estiver true falha os testes caso falte um step
		)
public class Runner {

}
