package Steps;
import Pages.LandingPage;
import Pages.LoginPage;
import Pages.PackagePage;
import Pages.TeacherPage;
import Tests.TestBase;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class UserRegistration extends TestBase {
   //private WebDriver driver;
//    @Before
//    public void createDriver() {
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//    }

    LoginPage logObj;
    LandingPage LandingObj;
    PackagePage PackageObj;
    TeacherPage TeacherObj;
    @Given("user inside login page And Click on login icon")
    public void user_inside_login_page() {
     logObj=new LoginPage(driver);
     logObj.ClickOnLoginIcon();
    }

    @When("user enter Email , password And Click on login button")
    public void User_Enter_Email_password_CLickOn_LoginIcon(){
        logObj=new LoginPage(driver);
        logObj.UserLogin("academy@classera.com","class987",driver);
    }
    @Then("User login successfully")
    public void Login_Successfully(){
        WebDriverWait wait;
        wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-book']")));
        Boolean Display = driver.findElement(By.xpath("//i[@class='fa fa-book']")).isDisplayed();
        System.out.println("Element displayed is :"+ Display);
    }
    @And("User Click on logout icon and enter Email,password to login with Classera")
    public void CLick_on_loginOut() throws InterruptedException {
        logObj=new LoginPage(driver);
        logObj.UserLoginWithClassera("demos223","12sudo4",driver);
    }

    @Then("User login with classera successfully")
    public void Login_With_Classera_successfully(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='pink-btn btn enroll-btn ng-binding ng-scope']")));
        Boolean Display = driver.findElement(By.xpath("//button[@class='pink-btn btn enroll-btn ng-binding ng-scope']")).isDisplayed();
        System.out.println("Element displayed is :"+ Display);
    }
    @When("User logout & Click on Sign up link")
    public void User_logout_and_ClickOnSignUp() throws InterruptedException {
        logObj=new LoginPage(driver);
        logObj.SignUp();
    }
   @And("User Fill the required data And click on SignUp Button")
   public void User_Fill_fields__AndClickOnSignUp() throws InterruptedException {
        logObj=new LoginPage(driver);
        logObj.UserSignUp(driver);
   }
   @Then("user Enter successfully")
   public void User_Entered_Successfully(){
       WebDriverWait wait = new WebDriverWait(driver, 20);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//aside[@class='col-lg-4 col-md-4 col-sm-5 minimized']//button[1]")));
       Boolean Display = driver.findElement(By.xpath("//aside[@class='col-lg-4 col-md-4 col-sm-5 minimized']//button[1]")).isDisplayed();
       System.out.println("Element displayed is :"+ Display);
   }
   @When("User Click on Teacher registration link to register")
   public void ClickOn_TeacherRegistration() throws InterruptedException {
       logObj=new LoginPage(driver);
       logObj.TeacherRegistration();

   }

    @Then("request is pending till admin approve")
    public void your_request_is_pending_message_displayed_successfully() {
        System.out.println("Thanks! Your account is pending approval now");

    }



}