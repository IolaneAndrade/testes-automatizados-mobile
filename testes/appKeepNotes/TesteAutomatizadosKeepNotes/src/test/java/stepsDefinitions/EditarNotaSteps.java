package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.EditarNotaPage;

public class EditarNotaSteps {
	
	EditarNotaPage umaNota = new EditarNotaPage(driver);

	// Cenario  - Modificar uma nota

	@Quando("que o usuario selecionar uma Nota existente")
	public void queOUsuarioSelecionarUmaNotaExistente() throws InterruptedException {
		Thread.sleep(10000);
		umaNota.selecionarNota();
	}

	@Quando("modifique o Title da Nota como {string}")
	public void modifiqueOTitleDaNotaComo(String titulo) throws InterruptedException {
		Thread.sleep(2000);
		umaNota.editarTitulo(titulo);
	}

	@Entao("o app tera modificado a Nota")
	public void oAppTeraModificadoANota() throws InterruptedException {
		Thread.sleep(2000);
		umaNota.validarEdicao();
	}
	

}
