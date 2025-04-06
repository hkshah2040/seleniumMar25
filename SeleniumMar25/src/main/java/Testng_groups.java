
public class Testng_groups {
	
	@org.testng.annotations.Test(groups= {"release specific"})
	public void electronics() {
		
	}
	
	@org.testng.annotations.Test(groups= {"release specific"})
	public void mobile() {
		
	}
	
	@org.testng.annotations.Test(groups= {"low priority"})
	public void kidsWear() {
		
	}
	
	@org.testng.annotations.Test(groups= {"low priority"})
	public void homeneeds() {
		
	}

}
