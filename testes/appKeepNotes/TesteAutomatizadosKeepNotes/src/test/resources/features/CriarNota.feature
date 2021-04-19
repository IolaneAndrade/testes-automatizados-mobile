#language: pt
#encoding: UTF-8
@criarNota @End2End
Funcionalidade: Criar Nota

  @criarnotasimples
  Cenario: criar uma nota
    Dado que eu estaja acessando o keep notes
    Quando eu acionar o botao take a note
    E eu informar o titulo como "Nota1"
    E eu informar o campo nota como "Uma nota de teste"
    E eu acionar o botao voltar
    Entao o aplicativo cadastra uma nova nota
