import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select obj = new Select(skills); //step-1
		obj.selectByValue("Certifications"); //step-2, Option-1
		obj.selectByIndex(7);   //Option-2
		obj.selectByVisibleText("Art Design"); // Option-3
		driver.get("https://demoqa.com/select-menu");
		WebElement cars = driver.findElement(By.name("cars"));
		Select sel = new Select(cars);
		sel.selectByIndex(0);
		sel.selectByValue("audi");
		sel.selectByVisibleText("Opel");
		sel.deselectByIndex(3);
		sel.deselectAll();
		List<WebElement> allOptions = sel.getOptions();
		System.out.println(sel.isMultiple());
		System.out.println(allOptions);
		driver.quit();
	}

}
