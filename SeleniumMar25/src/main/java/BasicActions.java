import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicActions {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com"); // 60 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.className("login-box")).click();
		driver.findElement(By.cssSelector("div.login-box")); // 1. tagname#id 2. tagname.className
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		String text = driver.getTitle();
		String source = driver.getPageSource();
		String url = driver.getCurrentUrl();
		System.out.println(text);
		System.out.println(source);
		System.out.println(url);
		driver.get("https://demoqa.com/links");
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.partialLinkText("Hom"));
		driver.quit();
	}

}
