import org.testng.annotations.Test;


public class Groupss {
	
	
	@Test(groups= {"High1"})
	public void test1() {
		System.out.println("Test-1");
	}
	@Test(groups= {"High1"})
	public void test2() {
		System.out.println("Test-2");
	}
	@Test(groups= {"low priority"})
	public void test3() {
		System.out.println("Test-3");
	}
	@Test(groups= {"High1"})
	public void test4() {
		System.out.println("Test-4");
	}
	@Test(groups= {"low priority"})
	public void test5() {
		System.out.println("Test-5");
	}

}
