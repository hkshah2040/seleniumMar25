import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicElementOperation {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.click();     //xpath Basic syntax: //tagname[@attributeName='value']
		firstName.clear();
		firstName.sendKeys("Sharada");
		firstName.submit();
		
		WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
		System.out.println(checkbox1.isDisplayed());
		boolean b = checkbox1.isDisplayed();  // returns true if displayed
		System.out.println(b);
		System.out.println(checkbox1.isSelected());  // c
		checkbox1.click();
		System.out.println(checkbox1.isSelected());
		checkbox1.isEnabled();  //
		
		driver.quit();
		
		
		
		
		
		

	}

}
