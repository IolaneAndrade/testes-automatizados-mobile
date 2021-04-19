$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Calculadora.feature");
formatter.feature({
  "name": "Realizar operacao",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@calculadora"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu estaja acessando a calculadora",
  "keyword": "Dado "
});
formatter.match({
  "location": "CalculadoraSteps.queEuEstajaAcessandoACalculadora()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "somar dois numeros",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@calculadora"
    },
    {
      "name": "@somarNumeros"
    }
  ]
});
formatter.step({
  "name": "eu digitar o numero Dois",
  "keyword": "Quando "
});
formatter.match({
  "location": "CalculadoraSteps.euDigitarONumeroDois()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar a tecla mais",
  "keyword": "E "
});
formatter.match({
  "location": "CalculadoraSteps.euAcionarATeclaMais()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar o numero Dois",
  "keyword": "E "
});
formatter.match({
  "location": "CalculadoraSteps.euDigitarONumeroDois()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digitar a tecla igual",
  "keyword": "E "
});
formatter.match({
  "location": "CalculadoraSteps.digitarATeclaIgual()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a calculadora apresenta o resultado \"4\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "CalculadoraSteps.aCalculadoraApresentaOResultado(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});