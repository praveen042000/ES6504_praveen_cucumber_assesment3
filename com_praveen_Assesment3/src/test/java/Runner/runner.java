package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="",features="src/test/source/Feature/register.feature",glue="praveen.assesment",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
	public class runner {
}





