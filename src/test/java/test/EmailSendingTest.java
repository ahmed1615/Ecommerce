package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.EmailPage;
import pages.Homepage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.ProductDetilsPage;
import pages.Reg;
import pages.SearchPage;

public class EmailSendingTest extends TestBase {
	

	Homepage home;
	Reg re;
	LoginPage login;
	MyAccountPage acc;
	SearchPage search;
	ProductDetilsPage product;
	EmailPage email;
	public String productname="Apple MacBook Pro 13-inch";
	public String myemail="ahmed11111.gooo@gmail.com";
	@Test(priority = 1, alwaysRun =true )
	public void userRegester() {
		home=new Homepage(driver);
		re=new Reg(driver);
		login=new LoginPage(driver);
		home.clicreg();
		re.setman();
		re.setFNameLastName("ahmed", "mohmed");
		re.setbirthday("20", "May", "1990");
		re.setEmailCompanyname(myemail, "cool");
		re.setpassandpass("holahola", "holahola");
		assertEquals(re.messageb.getText(), "Your registration completed");
	}
	@Test(dependsOnMethods ="userRegester")
	public void userCanSearchProduct() {
		search=new SearchPage(driver);
		search.searchproduct(productname);
		search.openproduct();
		product =new ProductDetilsPage(driver);
		assertTrue(product.raelitem.getText().equalsIgnoreCase(productname));
		}
	@Test(dependsOnMethods ="userCanSearchProduct" )
	public void sendEmail() {
		product=new ProductDetilsPage(driver);
		product.clicksendtofriend();
		email=new EmailPage(driver);
		email.sendmessagetoFriedn("kaka@kaka.com", myemail, "ay meesega for verification ok");
		assertTrue(email.resultSending.getText().contains("Your message has been sent."));
	}
	@Test(dependsOnMethods ="sendEmail" )
	public void logout() {
		re=new Reg(driver);
		re.logout();
	}

}
