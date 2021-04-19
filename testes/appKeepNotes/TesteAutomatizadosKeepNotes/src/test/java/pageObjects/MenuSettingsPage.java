package pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MenuSettingsPage {

	public MenuSettingsPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Open navigation drawer")
	private MobileElement botaoMenu;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
	private MobileElement opcaoSettings;
	
	@AndroidFindBy(id = "com.google.android.keep:id/settings_add_new_items_to_bottom")
	private MobileElement opcaoAddNewItemsToBottom;
	
	public void acionarMenu() throws InterruptedException {
		Thread.sleep(10000);
		botaoMenu.click();
	}
	
	public void selecionarSettings() throws InterruptedException {
		Thread.sleep(2000);
		opcaoSettings.click();
	}
	
	public void selecionarSwitch() throws InterruptedException {
		Thread.sleep(2000);
		opcaoAddNewItemsToBottom.click();
	}
	
	public void validarMudancaSwitch() throws InterruptedException {
		Thread.sleep(2000); 
		System.out.println("VAMOS VALIDAR O SWITCH");
		String atual = opcaoAddNewItemsToBottom.getText();
		System.out.println("************************");
		System.out.println("Atual: " + atual);
		System.out.println("*****************");
		assertEquals("false", opcaoAddNewItemsToBottom.getAttribute("checked"));
	}
	
	

}
