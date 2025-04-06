import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).submit();  // Pressing enter key
		driver.get("https://demoqa.com/links");
		driver.findElement(By.linkText("Home"));
		driver.findElement(By.partialLinkText("Hom")).click();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.cssSelector("input#user-name"));  //1.  tagname#id 2. tagname.className
		driver.findElement(By.cssSelector("div.login-box"));
		String title = driver.findElement(By.tagName("title")).getText();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		//xpath Syntax: //tagname[@attributeName='Value']	
		driver.quit(); 
	
	}

}
