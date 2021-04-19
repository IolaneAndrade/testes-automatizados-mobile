package stepsDefinitions;

import static utils.Utils.driver;

import java.net.MalformedURLException;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CriarNotaPage;
import static utils.Utils.*;

public class CriarNotaSteps {

	CriarNotaPage umaNota = new CriarNotaPage(driver);

	@Dado("que eu estaja acessando o keep notes")
	public void queEuEstajaAcessandoOKeepNotes() throws MalformedURLException, InterruptedException {
		acessarKeepNotes();
		Thread.sleep(10000);
	}

	// Cenario 1 : Criar nota

	@Quando("eu acionar o botao take a note")
	public void euAcionarOBotaoTakeANote() throws Exception {
		umaNota.acionarBotaoNovaNota();
	}

	@Quando("eu informar o titulo como {string}")
	public void euInformarOTituloComo(String titulo) throws InterruptedException {
		umaNota.preencherTitulo(titulo);
	}

	@Quando("eu informar o campo nota como {string}")
	public void euInformarOCampoNotaComo(String nota) {
		umaNota.preencherNota(nota);
	}

	@Quando("eu acionar o botao voltar")
	public void euAcionarOBotaoVoltar() throws Exception {
		umaNota.acionarBtnRetornar();
	}

	@Entao("o aplicativo cadastra uma nova nota")
	public void oAplicativoCadastraUmaNovaNota() throws InterruptedException {
		umaNota.validarNota();
	}

//	// Cenario 2 - Modificar uma nota
//
//	@Quando("que o usuario selecionar uma Nota existente")
//	public void queOUsuarioSelecionarUmaNotaExistente() throws InterruptedException {
//		umaNota.selecionarNota();
//	}
//
//	@Quando("modifique o Title da Nota como {string}")
//	public void modifiqueOTitleDaNotaComo(String titulo) throws InterruptedException {
//		umaNota.editarTitulo(titulo);
//	}
//
//	@Entao("o app tera modificado a Nota")
//	public void oAppTeraModificadoANota() throws InterruptedException {
//		umaNota.validarEdicao();
//	}
//	

}
