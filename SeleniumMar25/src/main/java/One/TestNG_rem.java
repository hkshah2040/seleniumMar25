package One;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestNG_rem {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void remove_dubs() {
		driver = new EdgeDriver(); //1
		driver.get("https://demo.automationtesting.in/Alerts.html"); //2
		driver.manage().window().maximize(); //3
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));// 4
	}
	
	@AfterClass
	public void done() {
		driver.quit();
	}
	

}
