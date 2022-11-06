package stepdefination;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Applicationhook.Apphook;
import Baseclass.BasePage;
import Baseclass.LogPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logsteps  {
	public static ExtentHtmlReporter reporter ;
	public static ExtentReports report;
	public static ExtentTest extent;
	public static WebDriver driver;
	public LogPage lp= new LogPage();
	@Before
	public void InitalizingReports() {
		System.out.println("Report is starting");
		report= new ExtentReports();
		reporter = new ExtentHtmlReporter("C:\\Users\\praja\\eclipse-workspace\\Cucke\\test-output\\SparkReport\\Spark1.html");
		report.attachReporter(reporter);
		reporter.config().setReportName("Automation Test Results");
		report.setSystemInfo("System", "Window");
		report.setSystemInfo("Author", "Rajatkumar Prajapati");
		report.setSystemInfo("Build#", "1.1");

		extent = report.createTest("******-*******--Browser is Going to Start--******-*******");
		report.flush();
		
	}
	@Given("i am on login page i am good {string}")
	public void i_am_on_login_page_i_am_good(String url) {
		extent = report.createTest("Browser opened successfully ");
		//report.createTest("Browser opened successfully ");
		driver=lp.initate_Browser();
		extent.log(Status.PASS, "Browser started successfull ");
		
		report.flush();
		/*driver =BasePage.getDriver();
	   driver.get(url);*/
	}

	@When("i am taking title")
	public void i_am_taking_title() throws InterruptedException {
		//Thread.sleep(3000);
		extent = report.createTest("Browser opened successfully ");
		//report.createTest("looking for Title ");
	    System.out.println(lp.titlestring());
	    extent.log(Status.PASS, "Title is Correct");
	    extent.addScreenCaptureFromPath(lp.TakingScreenShot());
	    
	    System.out.println("------******--------"+driver.getTitle()+"------******--------");
	    report.flush();

	}

	@Then("verifying title is good")
	public void verifying_title_is_good() throws InterruptedException {
		//Thread.sleep(3000);
	    System.out.println("title was correct");
	    extent=report.createTest("Title found now closing browser ");
	    extent.log(Status.PASS, "Browser closed Successfully");
	    extent.addScreenCaptureFromPath(lp.TakingScreenShot());
	    lp.teardown();
	    
	    System.out.println("*-----------------------Browser Closed-----------------------*");
	    report.flush();
	  
	}
	
	@Given("i am AS SA login page i am good {string}")
	public void i_am_as_sa_login_page_i_am_good(String String) {
		/*driver =BasePage.getDriver();
		   driver.get(BasePage.prop.getProperty("url")); */ 
		lp.initate_Browser();
		   System.out.println("-------------*************---URL Added from Properties file-----***************---------");
	}
	@After
	public void ClosingReport() {
		report.flush();
	}

}
