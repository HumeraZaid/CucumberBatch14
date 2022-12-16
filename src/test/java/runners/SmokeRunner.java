package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // We use features to provide the path of all the feature files
        features = "src/test/resources/features/",
        glue = "steps",
        // When you set dryRun to true, it stops actual execution
        // It will quickly scan all the Gherkin steps whether they are implemented or not
        // When we set dryRun to false, it starts execution again
        dryRun = false,
        tags = "@tc1101",
        // To remove irrelevant information from the console, you need to set monochrome to true
        monochrome = true,
        // The pretty keyword prints the steps in the console to increase readability
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json",
                  "rerun:target/failed.txt"}

)

public class SmokeRunner {

}
