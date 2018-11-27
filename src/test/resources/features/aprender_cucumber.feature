#language:pt
Funcionalidade: Aprender Cucumber
	Como um aluno
	Eu quero aprender a utilizar Cucumber
	Para que eu possa automatizar critérios de aceitação
	
	
	Cenario:
		Dado que o valor é 15
		Quando eu incrementar em 5
		Entao o valor do contador sera 20
		
	Cenario: Deve calcular atraso no prazo de entrega
		Dado que o prazo eh dia 02/04/2018
		Quando a entrega atrasar em 2 dias
		Entao a entrega sera efetuada em 04/04/2018
		
	Cenario: Deve calcular atraso no prazo de entrega da china
		Dado que o prazo eh dia 07/04/2018
		Quando a entrega atrasar em 2 meses
		Entao a entrega sera efetuada em 07/06/2018	
		
		
	Cenario:Devo criar passos genericos para esses 
		
		