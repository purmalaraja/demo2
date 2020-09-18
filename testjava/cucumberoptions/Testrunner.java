package cucumberoptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="testjava/features/login.feature",
glue="stepdefination")
public class Testrunner extends AbstractTestNGCucumberTests {

}
