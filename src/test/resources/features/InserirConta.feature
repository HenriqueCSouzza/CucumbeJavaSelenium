#language: pt
Funcionalidade: Cadastro de contas
  
  Como um usuário 
  Gostaria de cadastrar contas
  Para que eu possa distribuir meu dinheiro de uma forma mais organizada

  Contexto: Acessando e logando a aplicação
    Dado que estou acessando a aplicação
    Quando informo o usuário "teste@teste.teste"
    E a senha "teste"
    E seleciono entrar
    Então visualizo a página inicial
    Quando seleciono Contas

  Cenário: Deve inserir uma conta com sucesso
    E seleciono Adicionar
    E informo a conta "Conta de Teste"
    E seleciono Salvar
    Então a conta é inserida com sucesso

  Cenário: Não deve inserir uma conta sem nome

    E seleciono Adicionar
    E seleciono Salvar
    Então sou notificar que o nome da conta é obrigatório

  Cenário: Não deve inserir uma conta com nome já existente

    E seleciono Adicionar
    E informo a conta "Conta para extrato"
    E seleciono Salvar
    Então sou notificado que já existe uma conta com esse nome
