package pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EditarNotaPage {

	String tituloInicial;
	String tituloFinal;

	public EditarNotaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.google.android.keep:id/editable_title")
	private MobileElement titulo;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@index='0']")
	private MobileElement btnRetornar;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Nota1']")
	private MobileElement selecionaNota;

	public void editarTitulo(String campoTituloModificado) throws InterruptedException {
		Thread.sleep(2000);

		titulo.click();
		tituloInicial = titulo.getText();
		titulo.clear();
		titulo.sendKeys(campoTituloModificado);
		tituloFinal = campoTituloModificado;
		Thread.sleep(2000);
		System.out.println("*************************************");
		System.out.println(tituloInicial);
		System.out.println(tituloFinal);
		System.out.println("**************************************");
	}

	public void acionarBtnRetornar() throws Exception {
		System.out.println("retornando para pagina inicial");
		Thread.sleep(2000);
		btnRetornar.click();
	}

//	public void validarNota() throws InterruptedException {
//		System.out.println("Nota Existe!");
//		Thread.sleep(2000);
//
//		notaExiste.click();
//
//		System.out.println("*************************************");
//		System.out.println(validaTitulo);
//		System.out.println(titulo.getText());
//		System.out.println("**************************************");
//
//		assertEquals(validaTitulo, titulo.getText());
//	}

	public void selecionarNota() throws InterruptedException {
		Thread.sleep(10000);
		selecionaNota.click();
	}

	public void validarEdicao() throws InterruptedException {
		System.out.println("VALIDAR EDICAO");
		System.out.println("*************************************");
		System.out.println(tituloInicial);
		System.out.println(tituloFinal);
		System.out.println("**************************************");

		assertEquals("Editar Nota existente", tituloFinal);

	}

}
