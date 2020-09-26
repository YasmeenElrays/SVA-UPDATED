package Runner;

import Tests.TestBase;
import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Feature"},glue = {"Steps"},plugin = {"pretty","html:target/cucumber-html-report"},strict = true)
public class TestRunner extends AbstractTestNGCucumberTests{
    public class TestRunner1 extends TestBase {



}}


