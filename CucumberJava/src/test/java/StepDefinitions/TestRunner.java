package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        features="src/main/resources/Features/LoginDemo.feature",
        features="src/main/resources/Features/LoginDemo.feature",
        glue= {"StepDefinitions"},
        monochrome= true,
        plugin = {"pretty", "junit:target/JUnitReports/report.xml",
                "json:target/JSONReports/report.json",
                "html:target/HtmlReports",
                "json:target/cucumber.json"}
)
public class TestRunner {

}