import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicElementOperations {

	public static void main(String[] args) {
WebDriver driver = new EdgeDriver();

driver.get("https://demo.automationtesting.in/Register.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
WebElement register = driver.findElement(By.xpath("//h2[text()='Register']"));
System.out.println(register.getText());

List<WebElement> reg = driver.findElements(By.xpath("//div[@class='form-group']"));
System.out.println(reg.size());
driver.quit();
	}
}
