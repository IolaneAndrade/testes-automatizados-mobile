package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalculadoraPage {
	
	public CalculadoraPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.android.calculator2:id/digit_2")
	private MobileElement digitoDois;
	
	@AndroidFindBy(accessibility = "plus")
	private MobileElement digitoPlus;
	
	
	@AndroidFindBy(id = "com.android.calculator2:id/eq")
	private MobileElement digitoIgual;
	
	
	public void digitarDois() {
		digitoDois.click();
	}
	
	public void digitarPlus() {
		digitoPlus.click();
	}
	
	public void digitarIgual() {
		digitoIgual.click();
	}

}
