package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public class LandingPage extends PageBase {
    public LandingPage(WebDriver driver) {
        super(driver);
        scroll = (JavascriptExecutor)driver;
    }

    @FindBy(linkText = "Registration")
    WebElement RegistrationLink;
    @FindBy(xpath = "//a[contains(text(),'Browse Courses')]")
    WebElement BrowseCourses;
    @FindBy(xpath = "//span[contains(text(),'English')]")
    WebElement ChangeToEnglish;
    @FindBy(xpath = "//a[@class='ng-scope']//img")
    WebElement ClickOnLogo;
    @FindBy(xpath = "//i[@class='fa fa-users']")
    WebElement CLickOnMooc;
    @FindBy(xpath = "//section[@class='ng-scope']//button[2]")
    WebElement ClickOnlive;
    @FindBy(xpath = "//input[@placeholder='Search for a course title']")
    WebElement SearchForCourses;
    @FindBy(xpath = "//div[@class='courses-list-holder no-padding-top ng-isolate-scope animated-container']//div[1]//div[1]//figure[1]//img[1]")
    WebElement ClickOnCourse;
    @FindBy(xpath = "/html/body/div[2]/div[2]/main/div/div/aside/div/button\n")
    WebElement EnrollBtn;
    @FindBy(xpath = "/html/body/div[2]/div[2]/ng-include/div/ng-include/div/div/div[1]/div/div[4]/div/div/div/div/div/a\n")
    WebElement Registration;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/div[1]/div[3]/ul[1]/li[1]/div[2]/div[1]/form[1]/div[8]/button[1]")
    WebElement RegisterBtn;
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/header/div/div[3]/ul/li[1]/div[3]/button\n")
    WebElement CloseBtn;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/div[1]/div[3]/ul[1]/li[1]/div[3]/button[1]")
    WebElement Close2;


    public void CheckBrowseCourses(WebDriver driver){
        PageBase.ClickButton(ChangeToEnglish);
        PageBase.ClickButton(BrowseCourses);
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//main[@class='main-content white-bg ng-scope section-padding']//button[1]")));
        Boolean Display = driver.findElement(By.xpath("//main[@class='main-content white-bg ng-scope section-padding']//button[1]")).isDisplayed();
        System.out.println("Element displayed is :"+ Display);
    }
    public void ClickOnLogo() throws InterruptedException {
        PageBase.ClickButton(ClickOnLogo);
//         ClickButton(Registration);
//         Thread.sleep(1000);
//         ClickButton(CloseBtn);
    }
    public void Search(WebDriver driver) throws InterruptedException, AWTException {
        //ScrollDown();
        //ScrollDown();
        //Non_Existing Course
//        Actions action = new Actions(driver);
//        action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        Robot robot =new Robot();
        robot.mouseWheel(90);
        Thread.sleep(3000);
        PageBase.TxtInElementTxt(SearchForCourses,"blabla");
        // ScrollDown();
        Thread.sleep(2000);
        SearchForCourses.clear();
        //Existing Course
        PageBase.TxtInElementTxt(SearchForCourses,"Now");
        Thread.sleep(2000);
        SearchForCourses.clear();
    }
    public void CourseFilter(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        //ScrollDown();
        PageBase.ClickButton(CLickOnMooc);
        Thread.sleep(2000);
        PageBase.ClickButton(ClickOnlive);
        Thread.sleep(2000);
        driver.navigate().refresh();
    }
    public void CLickOnCourse(WebDriver driver) throws InterruptedException, AWTException {
        Thread.sleep(2000);
        Robot robot =new Robot();
        robot.mouseWheel(140);
//         Actions action = new Actions(driver);
//         action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
//         ScrollDown();
        ScrollDown();
        PageBase.ClickButton(ClickOnCourse);
        Thread.sleep(1000);
        ScrollDown();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn pink-btn enroll-btn ng-binding ng-scope']")));
        Boolean Display = driver.findElement(By.xpath("//button[@class='btn pink-btn enroll-btn ng-binding ng-scope']")).isDisplayed();
        System.out.println("Element displayed is :"+ Display);
        PageBase.ClickButton(EnrollBtn);
        Boolean Display2 = driver.findElement(By.xpath("//button[@class='btn btn-info btn-lg btn-block btn btn-default login-btn ng-binding']")).isDisplayed();
        System.out.println("Element displayed is :"+ Display2);

    }

}

