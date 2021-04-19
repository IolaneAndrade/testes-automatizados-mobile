package pageObjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CriarNotaPage {

	String tituloInicial;
	String tituloFinal;
	String validaTitulo;

	public CriarNotaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "New text note")
	private MobileElement botaoAddNota;

	@AndroidFindBy(id = "com.google.android.keep:id/new_list_button")
	private MobileElement btnLista;

	@AndroidFindBy(id = "com.google.android.keep:id/editable_title")
	private MobileElement titulo;

	@AndroidFindBy(id = "com.google.android.keep:id/edit_note_text")
	private MobileElement nota;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@index='0']")
	private MobileElement btnRetornar;

	@AndroidFindBy(xpath = "//androidx.cardview.widget.CardView[@index='0']")
	private MobileElement notaExiste;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Nota1']")
	private MobileElement selecionaNota;

	public void acionarBotaoNovaNota() throws Exception {
		System.out.println("adicionando nova nota");
		Thread.sleep(10000);
		botaoAddNota.click();

	}

	public void preencherTitulo(String campoTitulo) throws InterruptedException {
		Thread.sleep(2000);
		titulo.click();
		titulo.sendKeys(campoTitulo);
		validaTitulo = campoTitulo;
	}

	public void editarTitulo(String campoTituloModificado) throws InterruptedException {
		Thread.sleep(2000);

		titulo.click();
		tituloInicial = titulo.getText();
		titulo.clear();
		Thread.sleep(500);
		titulo.sendKeys(campoTituloModificado);
		tituloFinal = campoTituloModificado;
		Thread.sleep(2000);
		System.out.println("*************************************");
		System.out.println(tituloInicial);
		System.out.println(tituloFinal);
		System.out.println("**************************************");
	}

	public void preencherNota(String campoNota) {
		nota.click();
		nota.sendKeys(campoNota);
	}

	public void acionarBtnRetornar() throws Exception {
		System.out.println("retornando para pagina inicial");
		Thread.sleep(2000);
		btnRetornar.click();
	}

	public void validarNota() throws InterruptedException {
		System.out.println("Nota Existe!");
		Thread.sleep(2000);

		notaExiste.click();

		System.out.println("*************************************");
		System.out.println(validaTitulo);
		System.out.println(titulo.getText());
		System.out.println("**************************************");

		assertEquals(validaTitulo, titulo.getText());
	}

	public void validarEdicao() throws InterruptedException {
		System.out.println("VALIDAR EDICAO");
		System.out.println("*************************************");
		System.out.println(tituloInicial);
		System.out.println(tituloFinal);
		System.out.println("**************************************");

		assertFalse(tituloInicial.equals(tituloFinal));
		Thread.sleep(2000);

	}

}
