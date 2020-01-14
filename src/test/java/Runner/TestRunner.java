package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java\\Features\\BookingTicket.feature"},format="html:target/site/cucumber-pretty",glue = "StepDefinition")
public class TestRunner {

}
