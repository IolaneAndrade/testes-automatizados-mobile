$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CriarNota.feature");
formatter.feature({
  "name": "Criar Nota",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@criarNota"
    },
    {
      "name": "@End2End"
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
  "name": "que eu estaja acessando o keep notes",
  "keyword": "Dado "
});
formatter.match({
  "location": "CriarNotaSteps.queEuEstajaAcessandoOKeepNotes()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "criar uma nota",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@criarNota"
    },
    {
      "name": "@End2End"
    },
    {
      "name": "@criarnotasimples"
    }
  ]
});
formatter.step({
  "name": "eu acionar o botao take a note",
  "keyword": "Quando "
});
formatter.match({
  "location": "CriarNotaSteps.euAcionarOBotaoTakeANote()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu informar o titulo como \"Nota1\"",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euInformarOTituloComo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu informar o campo nota como \"Uma nota de teste\"",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euInformarOCampoNotaComo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar o botao voltar",
  "keyword": "E "
});
formatter.match({
  "location": "CriarNotaSteps.euAcionarOBotaoVoltar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o aplicativo cadastra uma nova nota",
  "keyword": "Entao "
});
formatter.match({
  "location": "CriarNotaSteps.oAplicativoCadastraUmaNovaNota()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});