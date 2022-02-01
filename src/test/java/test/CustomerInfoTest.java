package test;

import org.testng.annotations.Test;

import pages.Homepage;
import pages.LoginPage;
import pages.MyAccInfo;
import pages.MyAccountPage;
import pages.Reg;

public class CustomerInfoTest extends TestBase {
		LoginPage login;
		Homepage home;
		Reg re;
		MyAccountPage info;
		String mail="ahmed.gooo@gmail.com";
		String pass="cool100";
		
	 @Test(priority = 1,alwaysRun = true )
		public void userlogin() {
			login=new LoginPage(driver);
			home=new Homepage(driver);
			home.clickLogin();
			login.userLogin(mail, pass);
			login.clicklogin();
}
	 @Test(dependsOnMethods ="userlogin")
	 public void myaccount() {
		 Reg re=new Reg(driver);
		 re.openMyAccount();
		 MyAccInfo info =new MyAccInfo(driver);
		 info.opencustomerinfo();
		 info.selectgenero("woman");
		 info.addFnameLname("kaka", "nana");
		 info.changefecha("18", "March", "1995");
		 info.savedata();
		 
	 }
}
