import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestingFramework2 {

	@Test()
	public void test1() {   //Test NG
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement start = driver.findElement(By.id("mongo"));
		WebElement end = driver.findElement(By.id("droparea"));
		Actions action = new Actions(driver);
		action.dragAndDrop(start, end).perform();
		action.contextClick(end).perform();
		action.doubleClick(start).perform();
		action.clickAndHold(start).perform();
		action.click(end).perform();
		WebElement video = driver.findElement(By.xpath("//a[text()='Video']"));
		WebElement yt = driver.findElement(By.xpath("//a[text()='Youtube']"));
		action.moveToElement(video).moveToElement(yt).click().perform();
		driver.quit();
	}
	
	@Test
	public void test2() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement start = driver.findElement(By.id("mongo"));
		WebElement end = driver.findElement(By.id("droparea"));
		Actions action = new Actions(driver);
		action.dragAndDrop(start, end).perform();
		action.contextClick(end).perform();
		action.doubleClick(start).perform();
		action.clickAndHold(start).perform();
		action.click(end).perform();
		WebElement video = driver.findElement(By.xpath("//a[text()='Video']"));
		WebElement yt = driver.findElement(By.xpath("//a[text()='Youtube']"));
		action.moveToElement(video).moveToElement(yt).click().perform();
		driver.quit();
	}

	@Test
	public void test3() {
		
	}
}
