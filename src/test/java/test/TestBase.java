package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.Helper;

public class TestBase {

	public static WebDriver driver;
	public static String user=System.getProperty("user.dir");
	public String applink="https://demo.nopcommerce.com/";
	
	
	@BeforeSuite
	@Parameters({"browser"})
	public void StartDriver(@Optional("chrome") String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",user+"/drivers/chromedriver.exe");
		driver=new ChromeDriver();}
		else if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",user+"/drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.chrome.driver",user+"/drivers/msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		//String appLink="https://demo.nopcommerce.com/";
		driver.manage().window().maximize();
		driver.get(applink);
		driver.manage().deleteAllCookies();
		
	}
	public static void passalart() {
		driver.switchTo().alert().accept();
		
	}
	@AfterSuite
	public void CloseTab() {
		//driver.quit();
	}
	@AfterMethod
	public void takescreenonfailer(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			System.out.println("faild");
			System.out.println("take screenshot.......");
			Helper.takescreenshot(driver, result.getName());
		}
	}
	

}
