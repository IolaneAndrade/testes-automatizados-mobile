package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.acessarCalculadora;
import static utils.Utils.driver;

import java.net.MalformedURLException;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CalculadoraPage;
public class CalculadoraSteps {

	CalculadoraPage calculadora = new CalculadoraPage(driver);

	@Dado("que eu estaja acessando a calculadora")
	public void queEuEstajaAcessandoACalculadora() throws MalformedURLException {
		acessarCalculadora();

	}

	@Quando("eu digitar o numero Dois")
	public void euDigitarONumeroDois() throws InterruptedException {
		Thread.sleep(2000);
		calculadora.digitarDois();
	}

	@E("eu acionar a tecla mais")
	public void euAcionarATeclaMais() throws InterruptedException {
		Thread.sleep(2000);
		calculadora.digitarPlus();
	}
	
	@E("digitar a tecla igual")
	public void digitarATeclaIgual() throws InterruptedException {
		calculadora.digitarIgual();
		Thread.sleep(2000);
	}

	@Entao("a calculadora apresenta o resultado {string}")
	public void aCalculadoraApresentaOResultado(String numero) throws InterruptedException {
		assertEquals("4", driver.findElementById("com.android.calculator2:id/result").getText());
	}

}
