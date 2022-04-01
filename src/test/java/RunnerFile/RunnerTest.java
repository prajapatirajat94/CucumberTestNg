package RunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\praja\\eclipse-workspace\\Cucke\\src\\test\\java\\Features"},
                 glue= {"stepdefination","Applicationhook"},plugin= {"pretty",
         				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        				"timeline:test-output-thread/"}
              )
public class RunnerTest {

	
}
