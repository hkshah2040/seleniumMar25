package One;

public class Testng_groups { // 100 Test Cases: 20 TestCases
	
	@org.testng.annotations.Test(groups= {"high priority"})
	public void electronics() {
		
	}
	
	@org.testng.annotations.Test(groups= {"high priority"})
	public void mobile() {
		
	}
	
	@org.testng.annotations.Test(groups= {"low priority"})
	public void kidsWear() {
		
	}
	
	@org.testng.annotations.Test(groups= {"low priority"})
	public void homeneeds() {
		
	}

}
