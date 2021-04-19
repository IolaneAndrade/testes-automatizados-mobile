$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/MenuSettings.feature");
formatter.feature({
  "name": "Menu Settings",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@menusettings"
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
  "name": "acessar menu settings",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@menusettings"
    },
    {
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "name": "eu acionar o botao Menu",
  "keyword": "Quando "
});
formatter.match({
  "location": "MenuSettingsSteps.euAcionarOBotaoMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar a opcao Settings",
  "keyword": "E "
});
formatter.match({
  "location": "MenuSettingsSteps.euSelecionarAOpcaoSettings()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar a opcao Add new items to bottom",
  "keyword": "E "
});
formatter.match({
  "location": "MenuSettingsSteps.euSelecionarAOpcaoAddNewItemsToBottom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o switch da opcao Add new items to bottom ficara desabilitado",
  "keyword": "Entao "
});
formatter.match({
  "location": "MenuSettingsSteps.oSwitchDaOpcaoAddNewItemsToBottomFicaraDesabilitado()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});