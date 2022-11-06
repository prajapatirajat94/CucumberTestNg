package Applicationhook;



import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Baseclass.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Apphook {
private WebDriver driver;
public BasePage basepage;
public Properties prop;

@Before()
public void setup() {
	basepage = new BasePage();
	prop=basepage.init_Properties();
	System.out.println("--------*****----Initializing Properties ----*****------------");
	driver =basepage.init_driver(prop);
	System.out.println("*-----------------------Browser starting-----------------------*");
}
	
@After()
public void tear(Scenario scenario) {
		
	System.out.println("*-----------------------Browser Closed------------------------*");
	if (scenario.isFailed()) {
		// take screenshot:
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcePath, "image/png", screenshotName);

	}
driver.quit();
}
	
}
