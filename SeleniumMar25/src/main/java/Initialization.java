import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Initialization {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();  //Open the browser
		driver.manage().window().maximize();
		driver.get("https://www.google.ca");
		String url = driver.getCurrentUrl();
		System.out.println(driver.getTitle());
		System.out.println(url);
		if(driver.getTitle().contains("Google")) {
			System.out.println("Pass");
		}
		System.out.println(driver.getPageSource());
		driver.quit();
	}

}
