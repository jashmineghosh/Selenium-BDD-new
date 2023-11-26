package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;
import utilFaker.TestDataGenerator;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class MyStepdefsWithFaker {
    WebDriver driver = null;

    private static final Logger logger = Logger.getLogger(LoginDemoSteps_PF.class.getName());

    LoginPage_PF login;
    HomePage_PF home;

    @Given("browser is open from faker")
    public void browser_is_open() {

//        System.out.println("  ===  I am inside LoginDemoSteps_PF class ===== ");
        logger.info("\"  ===  I am inside faker class ===== \"");
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

    @And("user is on login page from faker")
    public void user_is_on_login_page() {

        driver.navigate().to("https://www.saucedemo.com/");

    }

    @When("user enters info on login page")
    public void user_enters_info_on_login_page() {
        login = new LoginPage_PF(driver);

        // Use Faker to generate test data
        String firstName = TestDataGenerator.generateFirstName();
        String generatePassword = TestDataGenerator.generatePassword();
        String email = TestDataGenerator.generateEmail();
        System.out.println("++++"+ firstName+"   "+generatePassword);
        // Fill in the form with generated data
//        firstNameInput.sendKeys(firstName);
//        password.sendKeys(generatePassword);
        login.enterUsername(firstName);
        login.enterPassword(generatePassword);

    }

    @And("user clicks on login from faker")
    public void user_clicks_on_login_from_faker() {

        login.clickOnLogin();
        // driver.findElement(By.id("login")).click();
    }
}
