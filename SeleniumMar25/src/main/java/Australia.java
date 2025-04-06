
public class Australia {
	
	public static void main(String[] args) {
		// Syntax: ClassName obj = new ClassName();
		Australia obj = new Australia();  // Default Constructor
		Australia obj2 = new Australia(5);
		Australia obj3 = new Australia(3,4);
System.out.println("This is main method");
method1();
method1(4);    // Method overloading/ Compile time Polymorphism
	}
	public static String method1() {
		System.out.println("this is a method");
		return "something";
	}
	
	public static int method1(int x) {
		return 5;
	}
	
	public Australia() {   // default
		System.out.println("This is constructor");
	}
	
	public Australia(int x) {  //Parameter constuctor
		System.out.println("Another Constructor");
	}
	
	public Australia(int x, int y) {  // Parameterized constructor
		System.out.println("two parameters constructor");
	}
	
	
	
}
