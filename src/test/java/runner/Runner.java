package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/",glue={"stepdefinitions"},monochrome = true,dryRun=false,plugin = {"html:reports/cucumber.html","pretty"}
		,tags=("@regisrtation or @home")
	
		)

public class Runner {

	
}

