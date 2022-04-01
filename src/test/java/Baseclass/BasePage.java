package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public  WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver  = new ThreadLocal<WebDriver>();
	
	public  WebDriver init_driver() {
		 WebDriverManager.chromedriver().setup();
		    tlDriver.set(new ChromeDriver());
		    getDriver().manage().deleteAllCookies();
		    return getDriver() ;
		
	}
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
}
