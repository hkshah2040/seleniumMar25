
public class ExceptionHandling {

	public static void main(String[] args) {
		// Error: External factors 
		int x = 5;
	try {
		int result = x/0; // invalid expected
	} catch(ArithmeticException e1) {
		System.out.println("Handled the error message");
	} finally {
		System.out.println("Finally block");
	}
		System.out.println("Java");
	
		
	}  // Types Error

	
	public void method1() {} //1. Compile time error  or checked exception
	
	
	
}
