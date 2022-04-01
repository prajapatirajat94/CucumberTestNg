package RunnerFile;

import org.testng.annotations.DataProvider;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features= {"C:\\Users\\praja\\eclipse-workspace\\Cucke\\src\\test\\java\\Features"},
glue= {"stepdefination","Applicationhook"},plugin= {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/"},tags= "@Homepage or @Login"
)
public class TestNgRunnerFile extends AbstractTestNGCucumberTests  {

	
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
	
	
}
