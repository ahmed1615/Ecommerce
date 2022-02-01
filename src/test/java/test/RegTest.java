package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.Reg;

public class RegTest extends TestBase{


	Homepage home;
	Reg re;
	LoginPage login;
	MyAccountPage acc;
	@Test(priority = 1, alwaysRun =true )
	public void userRegester() {
		home=new Homepage(driver);
		re=new Reg(driver);
		login=new LoginPage(driver);
		home.clicreg();
		re.setman();
		re.setFNameLastName("ahmed", "mohmed");
		re.setbirthday("20", "May", "1990");
		re.setEmailCompanyname("ahmed.gooo@gmail.com", "cool");
		re.setpassandpass("holahola", "holahola");
		assertEquals(re.messageb.getText(), "Your registration completed");
		
	}
	@Test(dependsOnMethods ="userRegester")
	public void logout() {
		re=new Reg(driver);
		re.logout();
	}
	@Test(dependsOnMethods ="logout")
	public void userlogin() {
		login=new LoginPage(driver);
		home=new Homepage(driver);
		home.clickLogin();
		login.userLogin("ahmed.gooo@gmail.com", "holahola");
		login.clicklogin();
		//passalart();
		//login.clicklogin();
		
		
	}
	@Test(dependsOnMethods ="userlogin")
	public void changepass() {
		re=new Reg(driver);
		re.openMyAccount();
		acc=new MyAccountPage(driver);
		acc.changepass("holahola", "cool100", "cool100");
		assertEquals(acc.passchangepass.getText(), "Password was changed");
		
	}

}
