package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.cartPage;
import pages.completePage;
import pages.infoPage;
import pages.loginPage;
import pages.overviewPage;
import pages.productDetailsPage;
import pages.productsPage;

public class shopping extends BaseTest {
	
	@Test
	public void purchase_bagpack() {
		  // Test cases Means set of actions in a sequences with a validations 
		loginPage lp = new loginPage(driver);
		productsPage pp = new productsPage(driver);
		productDetailsPage pdp = new productDetailsPage(driver);
		infoPage ip = new infoPage(driver);
		overviewPage op = new overviewPage(driver);
		completePage cp = new completePage(driver);
		cartPage cartpage = new cartPage(driver);
		lp.enterusername();
		lp.enterpassword();
		lp.clickLogin();
		pp.clickBackpack();
		pdp.clickAddToCart();
		pdp.clickCartLink();
		cartpage.clickCheckout();
		ip.enterDetails();
		op.clickFinish();
		String header = cp.getHeader();
		System.out.println(header);
		cp.clickBackHome();
		Assert.assertEquals(header, "Thank you for your order!"); // Pass or fail
	}
}
