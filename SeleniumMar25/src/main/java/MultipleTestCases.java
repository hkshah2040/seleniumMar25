import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class MultipleTestCases { // Test NG : test Next Generation

	@Test(priority=3, enabled =true)
	public void incognitoWindow() {
		EdgeOptions option = new EdgeOptions();
		option.addArguments("-inprivate");
		WebDriver driver = new EdgeDriver(option);
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.quit();
	}
	@Test(priority=1, timeOut=20000,dependsOnMethods= {"incognitoWindow"} ,description = "High priority, cannot ignored")
	public void scroll() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement submitBtn= driver.findElement(By.id("submitbtn"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", submitBtn); // Method-1
		Thread.sleep(1000);
		driver.get("https://www.amazon.in");  // Method-2
		int xCoordinate = 750; // Replace with your desired X value
		int yCoordinate = 890; // Replace with your desired Y value
		// Scroll to the specified coordinates
		js.executeScript("window.scrollBy(arguments[0], arguments[1]);", xCoordinate, yCoordinate);
		Thread.sleep(2000);
		driver.quit();
	}
	@Test(priority=2)
	public void HandleFrames() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement frame = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234567890");
		driver.switchTo().defaultContent();
		driver.quit();
	}
	
}
