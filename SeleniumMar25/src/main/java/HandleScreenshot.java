import java.io.File;
import org.testng.annotations.*;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleScreenshot {

	@org.testng.annotations.Test
	public void TakeScreenshot() throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
// 1. take a screenshot 2. save this screen to some location in some format
		TakesScreenshot screenshot = (TakesScreenshot) driver;  // step-1
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE); 
        //the destination for the screenshot
        File destFile = new File("myscreenshot.png");  //Step-2
        // Copy the screenshot to the destination
        FileUtils.copyFile(srcFile, destFile); // we need to add fileUtil dependency from maven
        driver.quit();
	}

}
