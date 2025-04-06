package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	public BasePage(WebDriver driver) {
	PageFactory.initElements(driver, this);   
	this.driver = driver;
	}

	public void waitForElement(WebElement e, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(e));
	}
	
	
	public void enterText(WebElement e, String text, int time) {
	waitForElement(e,time);
	e.sendKeys(text);
	}
	
	public void clickElement(WebElement e, int time) {
		waitForElement(e, time);
		e.click();
	}
	
	
	
}
