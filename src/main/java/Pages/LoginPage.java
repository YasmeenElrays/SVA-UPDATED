package Pages;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Random;


public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public static WebDriver driver;
    @FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/header[1]/div[1]/div[3]/ul[1]/li[1]/a[1]/i[1]")
    WebElement LoginIcon;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/header[1]/div[1]/div[3]/ul[1]/li[1]/a[1]/i[1]")
    WebElement loginIcon2;
    @FindBy(xpath = "//button[@class='btn btn-info btn-lg btn-block btn btn-default login-btn ng-binding']")
    WebElement LoginBtn;
    @FindBy(xpath = "//span[contains(text(),'English')]")
  public WebElement ChangeToEnglish;
    @FindBy(id="UserUsername")
    WebElement UserName;
    @FindBy(id = "UserPassword")
    WebElement UserPassword;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/header[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/form[1]/div[2]/button[1]")
    WebElement CloseBtn;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/header[1]/div[1]/div[3]/ul[1]/li[3]/a[1]/i[1]")
    WebElement LogOutBtn;
    @FindBy(xpath = "//button[@class='btn btn-info btn-lg btn-block btn btn-default login-btn login-with-classera ng-binding']")
    WebElement LoginWithClassera;
    @FindBy(id="go_signup")
    WebElement SignUp;
    @FindBy(xpath = "//*[@id=\"userForm\"]/div[1]")
    public
    WebElement ExpectedErrorMessage;
    @FindBy(xpath = "//form[@id='signupForm']//button[@class='white-btn signup-btn ng-binding'][contains(text(),'Register')]")
    WebElement RegisterBtn;
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/header/div/div[3]/ul/li[1]/div[2]/div/form/div[8]/div/div\n")
    public
    WebElement ExpectedErrorMessage2;
    @FindBy(xpath = "//form[@id='signupForm']//input[@placeholder='Name']")
    WebElement Name;
    @FindBy(xpath = "//form[@id='signupForm']//input[@placeholder='Confirm Password']")
    WebElement ConfirmPassword;
    @FindBy(xpath = "//form[@id='signupForm']//input[@placeholder='Email']")
    WebElement Email;
    @FindBy(xpath = "//form[@id='signupForm']//input[@placeholder='password']")
    WebElement PassWord;
    @FindBy(xpath = "//input[@placeholder='Classera school']")
    WebElement ClasseraSchool;
    @FindBy(xpath = "//input[@placeholder='Classera level']")
    WebElement ClasseraLevel;
    @FindBy(xpath = "//input[@placeholder='Mobile number']")
    WebElement MobileNumber;
    @FindBy(id = "go_teachers_signup")
    WebElement TeacherRegistration;
    @FindBy(xpath = "//form[@id='teacherRegistrationForm']//input[@placeholder='Name']")
    WebElement TeacherName;
    @FindBy(xpath = "//form[@id='teacherRegistrationForm']//input[@placeholder='Email']")
    WebElement TeacherEmail;
    @FindBy(xpath = "//form[@id='teacherRegistrationForm']//input[@placeholder='password']")
    WebElement TeacherPassword;
    @FindBy(xpath = "//form[@id='teacherRegistrationForm']//input[@placeholder='Confirm Password']")
    WebElement TeacherConfirmPassword;
    @FindBy(xpath = "//form[@id='teacherRegistrationForm']//button[@class='white-btn signup-btn ng-binding'][contains(text(),'Register')]")
    WebElement RegisterTeacherBtn;
    @FindBy(xpath = "//span[@id='go_to_reset']")
    WebElement ForgetPassword;
    @FindBy(xpath = "//input[@placeholder='example@example.com']")
    WebElement EnterYourEmail;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/div[1]/div[3]/ul[1]/li[1]/div[3]/button[1]")
    WebElement Close2;
    @FindBy(xpath = "//form[@id='resetEmail']//button[@class='btn pink-btn ng-binding'][contains(text(),'Send Verification Code')]")
    WebElement SendVerificationCode;
    @FindBy(xpath = "//div[@class='ng-binding ng-scope']")
    public
    WebElement PasswordMsg;
    @FindBy(xpath="//form[@id='signupForm']//p[@class='alert alert-danger ng-binding ng-scope'][contains(text(),'Email already exist')]")
    public
    WebElement EmailMsg;
    @FindBy(xpath = "//form[@id='signupForm']//button[@class='white-btn signup-btn ng-binding'][contains(text(),'Register')]")
    WebElement Register2;
    @FindBy(linkText = "Thanks! Your account is pending approval now")
    public WebElement ApproveMsg;
    @FindBy(xpath = "//input[@placeholder='Classera school country']")
    WebElement ClasseraSchoolCountry;
    @FindBy(xpath = "//input[@placeholder='Classera school type']")
    WebElement ClasseraSchoolType;

    public void ClickOnLoginIcon(){
        ClickButton(ChangeToEnglish);
        ClickButton(LoginIcon);
        ClickButton(CloseBtn);
    }
    public void ValidateMsg(){
        ClickButton(LoginIcon);
        ClickButton(LoginBtn);
    }
    public void UserLogin(String loginUser , String PW,WebDriver driver){
        TxtInElementTxt(UserName,loginUser);
        TxtInElementTxt(UserPassword,PW);
        ClickButton(LoginBtn);
//        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebDriverWait wait;
        wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-book']")));
        Boolean Display = driver.findElement(By.xpath("//i[@class='fa fa-book']")).isDisplayed();
        System.out.println("Element displayed is :"+ Display);
    }

    public void UserLoginWithClassera(String LoginUser,String PW, WebDriver driver) throws InterruptedException {
        ClickButton(LogOutBtn);
        Thread.sleep(1000);
        ClickButton(LoginIcon);
        TxtInElementTxt(UserName,LoginUser);
        TxtInElementTxt(UserPassword,PW);
        ClickButton(LoginWithClassera);
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='pink-btn btn enroll-btn ng-binding ng-scope']")));
        Boolean Display = driver.findElement(By.xpath("//button[@class='pink-btn btn enroll-btn ng-binding ng-scope']")).isDisplayed();
        System.out.println("Element displayed is :"+ Display);
    }
    public void SignUp() throws InterruptedException {
        ClickButton(LogOutBtn);
        Thread.sleep(1000);
        ClickButton(LoginIcon);
        Thread.sleep(2000);
        ClickButton(SignUp);
    }
    public void ValidateMsgSignUp() throws InterruptedException {
        Thread.sleep(2000);
        ClickButton(RegisterBtn);
    }
    public void CheckMsgWhenPWDOESNotMatch() throws InterruptedException {
        TxtInElementTxt(Name,"yassmeen");
        TxtInElementTxt(ConfirmPassword,"123456789");
        TxtInElementTxt(Email,"ya7713@classe.com");
        TxtInElementTxt(PassWord,"123456987");
        TxtInElementTxt(ClasseraSchool,"test");
        TxtInElementTxt(ClasseraLevel,"test");
        TxtInElementTxt(MobileNumber,"0123654");
        TxtInElementTxt(ClasseraSchoolCountry,"test");
        TxtInElementTxt(ClasseraSchoolType,"Testbrdo");
        ClickButton(Register2);
        Thread.sleep(2000);
          ClickButton(Close2);
    }
    public void CheckEmailIsExistBefore(WebDriver driver) throws InterruptedException {
        driver.navigate().refresh();
        ClickButton(LoginIcon);
        Thread.sleep(2000);
        ClickButton(SignUp);
        TxtInElementTxt(Name,"yassmeen");
        TxtInElementTxt(ConfirmPassword,"123456789");
        TxtInElementTxt(Email,"ya7713@classe.com");
        TxtInElementTxt(PassWord,"123456789");
        TxtInElementTxt(ClasseraSchool,"test");
        TxtInElementTxt(ClasseraLevel,"test");
        TxtInElementTxt(MobileNumber,"0123654");
        TxtInElementTxt(ClasseraSchoolCountry,"test");
        TxtInElementTxt(ClasseraSchoolType,"Testbrdo");
        ClickButton(RegisterBtn);
         Thread.sleep(1000);
         ClickButton(CloseBtn);
    }
    public void UserSignUp(WebDriver driver) throws InterruptedException {
        driver.navigate().refresh();
        ClickButton(LoginIcon);
        Thread.sleep(1000);
        ClickButton(SignUp);
        TxtInElementTxt(Name,"yassmeen");
        TxtInElementTxt(ConfirmPassword,"123456789");
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        Email.sendKeys("username"+ randomInt +"@gmail.com");
        //TxtInElementTxt(Email,"ya7713@classe.com");
        TxtInElementTxt(PassWord,"123456789");
        TxtInElementTxt(ClasseraSchool,"test");
        TxtInElementTxt(ClasseraLevel,"test");
        TxtInElementTxt(MobileNumber,"0123654");
        TxtInElementTxt(ClasseraSchoolCountry,"test");
        TxtInElementTxt(ClasseraSchoolType,"Testbrdo");
        ClickButton(RegisterBtn);
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//aside[@class='col-lg-4 col-md-4 col-sm-5 minimized']//button[1]")));
        Boolean Display = driver.findElement(By.xpath("//aside[@class='col-lg-4 col-md-4 col-sm-5 minimized']//button[1]")).isDisplayed();
        System.out.println("Element displayed is :"+ Display);
        ClickButton(LogOutBtn);
    }
    public void TeacherRegistration() throws InterruptedException {
        // ClickButton(LogOutBtn);
        Thread.sleep(2000);
        ClickButton(loginIcon2);
        Thread.sleep(1000);
        ClickButton(TeacherRegistration);
        TxtInElementTxt(TeacherName,"Yasssmen");
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        TeacherEmail.sendKeys("name"+ randomInt +"@gmail.com");
        // TxtInElementTxt(TeacherEmail,"Yaddu@class.com");
        TxtInElementTxt(TeacherPassword,"123456789");
        TxtInElementTxt(TeacherConfirmPassword,"123456789");
        ClickButton(RegisterTeacherBtn);
    }
    public void ForgetPassword() throws InterruptedException {
        Thread.sleep(2000);
        ClickButton(Close2);
        Thread.sleep(1000);
        ClickButton(LoginIcon);
        Thread.sleep(1000);
        ClickButton(ForgetPassword);
        TxtInElementTxt(EnterYourEmail,"ya7713@classe.com");
        ClickButton(SendVerificationCode);
    }
}

