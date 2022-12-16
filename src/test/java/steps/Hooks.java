package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks extends CommonMethods {

    // Use io.cucumber.java to import this hook
    @Before
    public void preCondition(){

        openBrowserAndLaunchApplication();

    }

    // Here we use special class called Scenario class from Cucumber
    // This class holds the complete information of your execution

    @After
    public void postCondition(Scenario scenario){
        byte[] pic;
        if(scenario.isFailed()){
            // Failed screenshot will be available inside failed folder
            pic =  takeScreenshot("failed/" + scenario.getName());
        }else {
            pic = takeScreenshot("passed/" + scenario.getName());
        }

        // To attach the screenshot in our report
        scenario.attach(pic, "image/png", scenario.getName());
        closeBrowser();
    }

}
