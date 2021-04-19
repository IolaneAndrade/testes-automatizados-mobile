package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.MenuSettingsPage;
import static utils.Utils.*;

public class MenuSettingsSteps {
	
	MenuSettingsPage menu = new MenuSettingsPage(driver);
	
	
	@Quando("eu acionar o botao Menu")
	public void euAcionarOBotaoMenu() throws InterruptedException {
	    menu.acionarMenu();
	}

	@Quando("eu selecionar a opcao Settings")
	public void euSelecionarAOpcaoSettings() throws InterruptedException {
	    menu.selecionarSettings();
	}

	@Quando("eu selecionar a opcao Add new items to bottom")
	public void euSelecionarAOpcaoAddNewItemsToBottom() throws InterruptedException {
	    menu.selecionarSwitch();
	}

	@Entao("o switch da opcao Add new items to bottom ficara desabilitado")
	public void oSwitchDaOpcaoAddNewItemsToBottomFicaraDesabilitado() throws InterruptedException {
	    menu.validarMudancaSwitch();
	}

}
