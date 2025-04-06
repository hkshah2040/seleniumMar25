import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium implements Test {

	public static void main(String[] args) {
		Selenium obj = new Selenium();
		int result = obj.add(10, 5);
		int result2 = obj.substraction(100, 50);
		System.out.println(result);
		System.out.println(result2);
		obj.accept();
		obj.declined();
		
		// Syntax: interface obj = new ClassName();
		Test obj1 = new Selenium();
	
	}
	
	public int add(int a, int b) {     // method paramters
		return a+b;            //method body
	}
	
	
	public int substraction(int a, int b) {
		return a-b;
	}

	public void accept() {
	System.out.println("Accepted");
		
	}

	public void declined() {
		// TODO Auto-generated method stub
		System.out.println("Reject");
	}


	
}
