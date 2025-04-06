package Two;

import One.AccessModifier;  // import packageName.className

public class NoAccess extends AccessModifier{

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();  // Seeking permissions
		am.method1();  // public 
		am.method2();  // Default
		am.method3();  // Private
		method4();  // protected
		method1();  // public
		
		

	}

}
