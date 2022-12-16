package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // We use features to provide the path of all the feature files
        features = "@target/failed.txt",
        glue = "steps",
        // When you set dry run to true, it stops actual execution
        // It will quickly scan all the Gherkin steps whether they are implemented or not
        // When we set dry run to false, it starts execution again
        // dryRun = false,
        // tags = "@tc1101",
        // To remove irrelevant information from the console, you need to set monochrome to true
        monochrome = true,
        // The pretty keyword prints the steps in the console to increase readability
        // To generate reports, we need plugin of runner class
        plugin = {"pretty"}
)

public class FailedRunner {
}
