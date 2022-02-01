package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.Homepage;

public class ContactUsTest extends TestBase {
	Homepage home;
	ContactUsPage conta;
	String name="ahmed";
	String email="hola@hola.com";
	String message="eh ya gd3an 3ala allah eñ 7kaya b2a  a7la msa 3ala kol el nas w 3alina isa :D ";
	String expectedm="Your enquiry has been successfully sent to the store owner.";
	
	@Test
	public void llenoContactUs() {
		home=new Homepage(driver);
		home.openContactUs();
		conta=new ContactUsPage(driver);
		conta.sendUs(name, email, message);
		assertEquals(conta.message.getText(),expectedm);
		
	}
}
