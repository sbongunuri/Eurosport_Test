package Test_Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",tags={"@Tennis_Videos"},monochrome = true, plugin = {
        "pretty", "html:target/cucumber-report/",
        "json:target/cucumber-reports/Cucumber.json"}, glue="Step_Definitions")


public class Test_Runner_Class {

}
