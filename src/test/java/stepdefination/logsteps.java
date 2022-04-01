package stepdefination;

import org.openqa.selenium.WebDriver;
import Baseclass.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logsteps {
	
	public static WebDriver driver;
	
	@Given("i am on login page i am good {string}")
	public void i_am_on_login_page_i_am_good(String url) {
		driver =BasePage.getDriver();
	   driver.get(url);;
	}

	@When("i am taking title")
	public void i_am_taking_title() throws InterruptedException {
		Thread.sleep(3000);
	    System.out.println(driver.getTitle());

	}

	@Then("verifying title is good")
	public void verifying_title_is_good() throws InterruptedException {
		Thread.sleep(3000);
	    System.out.println("title was correct");
	  
	}
}
