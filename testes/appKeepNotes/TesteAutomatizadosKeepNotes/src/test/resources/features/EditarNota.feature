#language: pt
#encoding: UTF-8
@modificarnota @End2End
Funcionalidade: Modificar Nota

  Cenario: Modificar Nota
    Dado que eu estaja acessando o keep notes
    Quando que o usuario selecionar uma Nota existente
    E modifique o Title da Nota como "Editar Nota existente"
    E eu acionar o botao voltar
    Entao o app tera modificado a Nota
