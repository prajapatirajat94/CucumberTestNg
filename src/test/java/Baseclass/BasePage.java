package Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public  WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver  = new ThreadLocal<WebDriver>();
	
	public  Properties prop;
	
	public  WebDriver init_driver(Properties prop) {
		 WebDriverManager.chromedriver().setup();
		    tlDriver.set(new ChromeDriver());
		    getDriver().manage().deleteAllCookies();
		    return getDriver() ;
		
	}
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
	
	public  Properties init_Properties() {
		prop = new Properties();
		FileInputStream file=null;
	
			try {
			file = new FileInputStream("C:\\Users\\praja\\eclipse-workspace\\Cucke\\src\\test\\java\\Applicationhook\\config.properties");	
			}
			catch(Exception f) {
				f.getStackTrace();
			}
			try {
				prop.load(file);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return prop;
	}
}
