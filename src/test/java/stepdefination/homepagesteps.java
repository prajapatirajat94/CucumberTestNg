package stepdefination;




import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import Baseclass.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class homepagesteps {
public static WebDriver driver;
public static SoftAssertions soft= new SoftAssertions();

	@Given("user is on loginpage by using url {string}")
	public void user_is_on_loginpage_by_using_url(String url) {
		 
		  driver = BasePage.getDriver();
		    driver.get(url);
	}

	@When("checking title of page")
	public void checking_title_of_page() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("I am on Checking title page");
		String title = driver.getTitle();
	    System.out.println(title);
	    
	   try {
	Assert.assertEquals("Online Shopping Canada: Everyday Low Prices at Walmart.ca!", driver.getTitle());
	   }
	   catch(Throwable e) {
		  	   
		   Assert.fail("title was not correct found it different actual title is: "+title);
		   
	   }
	  
	}
	  

	@Then("title is correct")
	public void title_is_correct() throws InterruptedException {
		Thread.sleep(2000);
		
		System.out.println(" Homepage title was correct");
		
	   	
		
		
	    
}
}