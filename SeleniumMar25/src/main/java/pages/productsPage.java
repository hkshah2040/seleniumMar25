package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage extends BasePage{
	
	//WebDriver driver;
	
	public productsPage(WebDriver driver) {
	super(driver);
	}

	// 1. Page Elements 
	
	@FindBy(id="item_4_title_link")
	private WebElement backPack;
	
	// 2. Page Actions
	
	public void clickBackpack() {
		backPack.click();
	}
}
