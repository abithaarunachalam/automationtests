package cucumber_runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(glue = {"resources.steps.Echelon","resources.steps.BioC"},
                features = {"src/test/features"},
                format = {"pretty", "html:Reports/out"},              
                strict = false, 
               // plugin = { "pretty", "html:target/htmlreports" },
                tags ={"@CSO"}
                )

///**
// * This test 'driver' does not execute the actual test cases, but does a strict
// * dry run instead. 
// * <p>
// * A dry run tests the Gherkin syntax for validity. Doing this strictly also
// * checks for all Cucumber glue code (step definitions) being available.
// */
//@RunWith(Cucumber.class)
//@CucumberOptions(
//        plugin = { "pretty" },
//        tags = { "~@ignore" }, 
//        strict = true, 
//        dryRun = true
//)
public class testvideorunner {

}
