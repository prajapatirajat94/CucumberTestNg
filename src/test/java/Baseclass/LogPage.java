package Baseclass;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class LogPage {
	private static WebDriver driver;
	public BasePage basepage;
	public static Properties prop;
	private static ExtentReports report;
	private static ExtentTest extent;
/**
 * WE are initializing driver from here
 * @return 
 */
public WebDriver initate_Browser() {
	basepage = new BasePage();
	prop=basepage.init_Properties();
	System.out.println("--------*****----Initializing Properties ----*****------------");
	driver =basepage.init_driver(prop);
	System.out.println("*-----------------------Browser starting-----------------------*");
	driver.get(prop.getProperty("url"));
	return driver;
}

public String titlestring() {
	return driver.getTitle();
}
public  String TakingScreenShot() {
	
	File Srcfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String Path ="C:\\Users\\praja\\eclipse-workspace\\Cucke\\Screenshot\\"+System.currentTimeMillis()+
			".png";
	try {
		FileUtils.copyFile(Srcfile, new File(Path));
	} catch (IOException e) {
		System.out.println("Directory not found;");
		extent.fail(e);
	}
	return Path;
	
}
public void teardown() {
	driver.quit();
}

}
