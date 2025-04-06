package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class infoPage extends BasePage{
	
	public infoPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="firstName")
	private WebElement fName;
	
	@FindBy(name="lastName")
	private WebElement lName;
	
	@FindBy(name="postalCode")
	private WebElement pCode;
	
	@FindBy(name="continue")
	private WebElement cont;
	
	
	public void enterDetails() {
		fName.sendKeys("Hirva");
		lName.sendKeys("Shah");
		pCode.sendKeys("342342344");
		cont.click();
	}
	
}
