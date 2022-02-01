package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.Homepage;

public class ProductHoverMenueTest extends TestBase{
	Homepage home;
	
	@Test(priority = 1,description ="test hover menue")
	public void userCanUseMenue() throws Exception {
		home=new Homepage(driver);
		home.entercompo();
		assertTrue(driver.getCurrentUrl().contains("notebooks"));
	}
	
}
