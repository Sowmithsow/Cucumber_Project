package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="src/test/resources/features",
		glue= {"StepDefinition","Hooks"},
		plugin= {"pretty","html:target/report1.html"},
		monochrome=true)

public class Runnerclass extends AbstractTestNGCucumberTests {

}
