package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage  extends BasePage{
	
	// 1. Page Elements

	public loginPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(name="user-name")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(id= "login-button")
	private WebElement loginBtn;
	
	
	// 2. Page Actions
	public void enterusername() {
		enterText(username,"standard_user", 3);
	}
	
	public void enterpassword() {
		enterText(pwd, "secret_sauce", 3);
	}
	
	public void clickLogin() {
		clickElement(loginBtn,2);
	}
	
	

}
