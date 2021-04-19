$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/EditarNota.feature");
formatter.feature({
  "name": "Modificar Nota",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@modificarnota"
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
  "name": "Modificar Nota",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@modificarnota"
    },
    {
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "name": "que o usuario selecionar uma Nota existente",
  "keyword": "Quando "
});
formatter.match({
  "location": "EditarNotaSteps.queOUsuarioSelecionarUmaNotaExistente()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "modifique o Title da Nota como \"Editar Nota existente\"",
  "keyword": "E "
});
formatter.match({
  "location": "EditarNotaSteps.modifiqueOTitleDaNotaComo(String)"
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
  "name": "o app tera modificado a Nota",
  "keyword": "Entao "
});
formatter.match({
  "location": "EditarNotaSteps.oAppTeraModificadoANota()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});