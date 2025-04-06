package One;
import Two.NoAccess;  //import packageName.className

public class AccessModifier {

	public static void main(String[] args) {

		AccessModifier obj = new AccessModifier();
		NoAccess obj2 = new NoAccess();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		method1();
		method2();
	}
	
	
	public static void method1() {  // Public method
		System.out.println("Method1");
	}
	
	static void method2() {   // default method
		System.out.println("Method2");
	}
	
	private static void method3() {  // Private
		System.out.println("Method3");
	}
	
	protected static void method4() {
		System.out.println("Method4");
	}
	
}
