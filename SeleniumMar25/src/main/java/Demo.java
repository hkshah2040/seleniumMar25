import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	public static void main(String[] args) {
	// step-1 open browser
		int x = 100;   // syntax: datatype variable = value;
		String name = "my name is Hirva ..........";
		long y = 32423l;  // 
		float z = 5.4f;
		double d = 543.67d;    // BSIL FD char
		char t = 'C';
		boolean b = false;
		byte bt = (byte) x;   // 0 to 127
		short s = 334;
		WebDriver driver = new ChromeDriver(); // Command to open browser
		driver.manage().window().maximize();
		driver.get("https://www.cnbc.com");
		driver.quit();
	}

}
