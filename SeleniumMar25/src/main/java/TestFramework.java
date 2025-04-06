import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestFramework extends BaseTest {
	
	/*
	@BeforeTest
	public void remove_dups() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	} */
	
	@org.testng.annotations.Test(timeOut=10000, dependsOnMethods= {"Incognito"} )
	public void TakeScreenshot() throws IOException {
		driver.get("https://demo.automationtesting.in/Register.html");
// 1. take a screenshot 2. save this screen to some location in some format
		TakesScreenshot screenshot = (TakesScreenshot) driver;  // step-1
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE); 
        //the destination for the screenshot
        File destFile = new File("myscreenshot.png");  //Step-2
        // Copy the screenshot to the destination
        FileUtils.copyFile(srcFile, destFile); // we need to add fileUtil dependency from maven
        driver.quit();
	}
	
	@org.testng.annotations.Test(description= "High alert")
	public void HandleFrame() {
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement frame = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234567890");
		driver.switchTo().defaultContent();
	}
	
	@org.testng.annotations.Test()
	public void Incognito() {
		EdgeOptions option = new EdgeOptions();
		option.addArguments("-inprivate");
		WebDriver driver = new EdgeDriver(option);
		driver.get("https://demo.automationtesting.in/Register.html");
	}
	
	
	
	
	
	
	

}
