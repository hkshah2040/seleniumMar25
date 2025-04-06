import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		// collections in java
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']")).click();
        Set<String> allTabs =  driver.getWindowHandles(); // 1. get all windows 
        List<String> allTabsInList = new ArrayList<String>(allTabs); //2. Convert into ArrayList
        String firstTab = allTabsInList.get(0); // first Tab
        String secondTab = allTabsInList.get(1);  //Second Tab
        driver.switchTo().window(firstTab);
        Thread.sleep(500);
        driver.switchTo().window(secondTab);
        Thread.sleep(500);
        driver.switchTo().window(firstTab);
        Thread.sleep(500);
        driver.switchTo().window(secondTab);
        Thread.sleep(500);
        driver.switchTo().window(firstTab);
        Thread.sleep(500);
        driver.switchTo().window(secondTab);
        Thread.sleep(500);
        driver.quit();
	}

}
