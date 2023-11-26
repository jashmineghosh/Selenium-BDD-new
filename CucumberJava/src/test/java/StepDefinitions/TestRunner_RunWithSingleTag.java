package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/FeatureWithTags/Tags.feature",
        glue= {"StepDefinitions"},
//        tags = {"@smoke", "@regression"} //deprecated
// tags = "@smoke or @regression"
// tags = {"@smoke and @regression"}
// tags = {"(@smoke or @regression) and @important"}
// tags = {"@regression and not @smoke"}
tags = "(@smoke or @regression) and not @important"

)
public class TestRunner_RunWithSingleTag {

}