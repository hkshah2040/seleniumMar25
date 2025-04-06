import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDowns {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html"); //60 Sec
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement skills = driver.findElement(By.id("Skills"));
		Select dropdown = new Select(skills);
		dropdown.selectByValue("Art Design");
		dropdown.selectByIndex(13);
		dropdown.selectByVisibleText("AutoCAD");
		driver.get("https://demoqa.com/select-menu");
		Select select = new Select(driver.findElement(By.id("cars")));
		select.selectByVisibleText("Audi");
		select.selectByIndex(0);
		select.selectByIndex(1);
		select.deselectByValue("audi");
		select.deselectAll();
		boolean ismulti = select.isMultiple();
		System.out.println(ismulti);
		List<WebElement> getallselect = select.getAllSelectedOptions();
		System.out.println(getallselect); // empty
		List<WebElement> getAllOptions = select.getOptions();
		System.out.println(getAllOptions);
		driver.quit();
	}

}
