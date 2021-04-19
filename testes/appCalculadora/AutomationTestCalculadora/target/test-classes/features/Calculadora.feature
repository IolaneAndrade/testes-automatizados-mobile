#language: pt
#encoding: UTF-8
@calculadora
Funcionalidade: Realizar operacao

  Contexto: 
    Dado que eu estaja acessando a calculadora

  @somarNumeros
  Cenario: somar dois numeros
    Quando eu digitar o numero Dois
    E eu acionar a tecla mais
    E eu digitar o numero Dois
    E digitar a tecla igual
    Entao a calculadora apresenta o resultado "4"
