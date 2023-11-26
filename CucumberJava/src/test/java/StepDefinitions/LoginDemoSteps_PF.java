package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class LoginDemoSteps_PF {
    private static final Logger logger = Logger.getLogger(LoginDemoSteps_PF.class.getName());

    WebDriver driver = null;

    LoginPage_PF login;
    HomePage_PF home;

    @Given("browser is open")
    public void browser_is_open() {

//        System.out.println("  ===  I am inside LoginDemoSteps_PF class ===== ");
        logger.info("\"  ===  I am inside LoginDemoSteps_PF class ===== \"");
        logger.info("This is an info message.");
        logger.warning("this is warning");
        System.out.println("Inside Step - browser is open");

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is : "+projectPath);

//        System.setProperty("webdriver.gecko.driver", projectPath+"/src/test/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", projectPath+"/src/main/resources/drivers/chromedriver.exe");
//        driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        //driver.manage().window().maximize();

    }

    @And("user is on login page")
    public void user_is_on_login_page() {

        driver.navigate().to("https://www.saucedemo.com/");

    }

    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) throws InterruptedException  {

        login = new LoginPage_PF(driver);

        login.enterUsername(username);
        login.enterPassword(password);

        // driver.findElement(By.id("name")).sendKeys(username);
        // driver.findElement(By.id("password")).sendKeys(password);

        Thread.sleep(2000);
    }

    @And("user clicks on login")
    public void user_clicks_on_login() {

        login.clickOnLogin();
        // driver.findElement(By.id("login")).click();
    }


    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() throws InterruptedException {
        home = new HomePage_PF(driver);
        home.checkLogoutIsDisplayed();
        // driver.findElement(By.id("logout")).isDisplayed();

        Thread.sleep(2000);
        driver.close();
        driver.quit();

    }

}