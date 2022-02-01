package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	//screenshot when test fail
	public static void takescreenshot(WebDriver driver, String screenshotname) {
		Path des=Paths.get("./screenshot",screenshotname+".png");
		try {
			Files.createDirectories(des.getParent());
			FileOutputStream out=new FileOutputStream(des.toString());
			out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
			out.close();
		} catch (IOException e) {
			System.out.println("E while takeing screenshot");
		}
	}


}
