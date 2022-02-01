package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.LoginPage;
import pages.ProductDetilsPage;
import pages.ProductReview;
import pages.Reg;
import pages.SearchPage;

public class ProductReviewTest extends TestBase {
	
	Homepage home;
	Reg re;
	LoginPage login;
	SearchPage search;
	ProductDetilsPage product;
	ProductReview review;
	ProductDetilsPage pd;

	public String productname="Apple MacBook Pro 13-inch";
	//register
	@Test(priority = 1,alwaysRun = true,description = "regesteration for siempre")
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
	//search product
	
	@Test(dependsOnMethods ="userRegester")
	public void userCanSearchProduct() {
	search=new SearchPage(driver);
	search.searchproduct(productname);
	search.openproduct();
	product =new ProductDetilsPage(driver);
	assertTrue(product.raelitem.getText().equalsIgnoreCase(productname));
	
	}
	//review product
	@Test(dependsOnMethods = "userCanSearchProduct")
	public void usercanreviwproduct() {
	review=new ProductReview(driver);
	pd=new ProductDetilsPage(driver);
	pd.clicProductR();
	review.sendRtitleRtext("apple", "it is awesome");
	review.choosequality("bad");
	review.click_review_done();
	assertTrue(review.result_of_review.getText().equals("Product review is successfully added."));
	
}
}
