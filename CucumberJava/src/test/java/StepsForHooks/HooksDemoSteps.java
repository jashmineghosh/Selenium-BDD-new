package StepsForHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HooksDemoSteps {

    WebDriver driver = null;

//    @Before(value="@smoke", order=1) // this is when we only run for smoke
    @Before(order=1)
    public void browserSetup() {

        System.out.println("  I am inside browserSetup");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Before(order=0)
    public void setup2() {
        System.out.println("   I am inside setup2 \n");
    }

    @After(order=1)
    public void teardown() {
        System.out.println("   I am inside teardown");
        driver.close();
        driver.quit();
    }

    @After(order=2)
    public void teardown2() {
        System.out.println("  I am inside teardown2 \n");
    }

    @BeforeStep
    public void beforeSteps() {
        System.out.println("  I am inside beforeSteps ----");
    }

    @AfterStep
    public void afterSteps() {
        System.out.println("  I am inside afterSteps ====");
    }


    @Given("user is on login page")
    public void user_is_on_login_page() {
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
    }


}