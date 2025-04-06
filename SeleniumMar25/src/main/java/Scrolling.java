import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
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

}
