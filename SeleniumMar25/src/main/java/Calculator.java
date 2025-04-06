
public class Calculator {

	public static void main(String[] args) {
		 // ClassName obj = new ClassName();
Calculator tomsCalculator = new Calculator();
tomsCalculator.add(5,6);
tomsCalculator.Substract(100, 200);
tomsCalculator.devide(40, 6);
tomsCalculator.multiply(4,6);
	}

	public int add(int x, int y) {
		int z = x+y;
		System.out.println(z);
		return z;
	}
	
	public char name() {
		return 'A';
	}
	
	
	public void Substract(int x, int y) {
		int z = y-x;
		System.out.println(z);
	}
	
	
	public void devide(int x, int y) {
		int z = x/y;
		System.out.println(z);
	}
	
	public void multiply(int x, int y) {
		int z = x*y;
		System.out.println(z);
	}
	
	
	
	
	
	
	
	
	
}
