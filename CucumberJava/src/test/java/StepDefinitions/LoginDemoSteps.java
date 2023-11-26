package StepDefinitions;

public class LoginDemoSteps {

//	WebDriver driver = null;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//
//		System.out.println("Inside Step - browser is open");
//
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is : "+projectPath);
//
////		System.setProperty("webdriver.gecko.driver", projectPath+"/src/test/resources/drivers/geckodriver.exe");
//        System.setProperty("webdriver.chrome.driver", projectPath+"/src/main/resources/drivers/chromedriver.exe");
////		driver = new FirefoxDriver();
//        driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//
//		//driver.manage().window().maximize();
//
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//
//		driver.navigate().to("https://www.saucedemo.com/");
//
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException  {
//
//		driver.findElement(By.id("user-name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//
//		Thread.sleep(2000);
//	}
//
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//
//		driver.findElement(By.id("login-button")).click();
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() throws InterruptedException {
//
//		driver.findElement(By.id("react-burger-menu-btn")).isDisplayed();
//        driver.findElement(By.id("react-burger-menu-btn")).click();
//        driver.findElement(By.id("logout_sidebar_link")).click();
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
//
//	}

}