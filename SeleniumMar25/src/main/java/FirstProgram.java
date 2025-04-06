import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstProgram {

	public static void main(String[] args) {
	  WebDriver driver = new EdgeDriver();      	// Open the browser
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  driver.get("https://www.emirates.com");
	  driver.navigate().to("http://www.mircosoft.com");
	  driver.navigate().back();
	  driver.navigate().forward();
	  driver.navigate().refresh();
	  String title = driver.getTitle();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(title);
	  if(title.equalsIgnoreCase("Emirates | Fly Better"))
	  {
		  System.out.println("Pass");
	  }
	  driver.quit();
	}

}
