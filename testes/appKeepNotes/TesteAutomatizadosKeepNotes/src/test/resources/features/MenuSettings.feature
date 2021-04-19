#language: pt
#encoding: UTF-8
@menusettings @End2End
Funcionalidade: Menu Settings

  Cenario: acessar menu settings
    Dado que eu estaja acessando o keep notes
    Quando eu acionar o botao Menu
    E eu selecionar a opcao Settings
    E eu selecionar a opcao Add new items to bottom
    Entao o switch da opcao Add new items to bottom ficara desabilitado
