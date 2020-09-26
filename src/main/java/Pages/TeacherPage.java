package Pages;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TeacherPage extends PageBase {
    public TeacherPage(WebDriver driver) {
        super(driver);
        scroll = (JavascriptExecutor)driver;
    }

    @FindBy(xpath = "//a[contains(text(),'Teachers')]")
    WebElement Teachers;
    @FindBy(xpath = "/html/body/div[2]/div[2]/section/div/div/div/ng-include/aside/div[1]/form/div[1]/input\n")
    WebElement Name;
    @FindBy(xpath = "/html/body/div[2]/div[2]/section/div/div/div/ng-include/aside/div[1]/form/div[2]/input\n")
    WebElement Email;
    @FindBy(xpath = "/html/body/div[2]/div[2]/section/div/div/div/ng-include/aside/div[1]/form/div[3]\n")
    WebElement CreateBtn;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div[1]/h4\n")
    WebElement TeacherMsg;
    @FindBy(xpath = "//button[@class='btn btn-default close-modal ng-binding']")
    WebElement CloseBtn;
    @FindBy(xpath = "/html/body/div[1]/div[2]/section/div/div/div/div/div[1]/table/tbody/tr[1]/td[3]/button\n")
    WebElement Enrolled;
    @FindBy(xpath = "//button[@class='btn btn-small btn-default btn-pending ng-binding']")
    WebElement CancelBtn;
    @FindBy(xpath = "/html/body/div[1]/div[2]/section/div/div/div/div/div[1]/table/tbody/tr[1]/td[3]/div/button[1]\n")
    WebElement ApproveBtn;
    @FindBy(xpath = "/html/body/div[1]/div[2]/section/div/div/div/div/div[1]/table/tbody/tr[1]/td[3]/div/button[2]\n")
    WebElement DeclineBtn;
    @FindBy(xpath = "/html/body/div[1]/div[2]/section/div/div/div/div/div[1]/table/tbody/tr[1]/td[4]/i[3]\n")
    WebElement ViewIcon;
    @FindBy(xpath = "//tr[1]//td[4]//i[2]")
    WebElement EditIcon;
    @FindBy(xpath = "//button[@class='btn btn-success submit-btn ng-binding ng-scope']")
    WebElement SaveBtn;
    @FindBy(xpath = "//div[@class='form-group has-feedback']//input[@placeholder='Name']")
    WebElement EditName;
    @FindBy(xpath = "//tr[1]//td[4]//i[1]")
    WebElement DeleteIcon;
    @FindBy(xpath = "//button[@class='ngdialog-button ngdialog-button-secondary ng-binding']")
    WebElement CancelButton;
    @FindBy(xpath = "//div[@class='filter-cell pull-left']//input[@placeholder='Name']")
    WebElement Search;
    @FindBy(xpath = "//div[@class='filter-cell pull-left']//input[@placeholder='Email']")
    WebElement SearchEmail;
    @FindBy(xpath = "//select[@placeholder='Status']")
    WebElement Status;
    @FindBy(xpath = "//option[contains(text(),'Approved')]")
    WebElement Approved;
    @FindBy(xpath = "//option[contains(text(),'Declined')]")
    WebElement Declined;
    @FindBy(xpath = "//option[contains(text(),'Pending')]")
    WebElement Pending;
    @FindBy(xpath = "//input[@placeholder='Title in English']")
    WebElement TitleInEnglish;
    @FindBy(xpath = "//input[@placeholder='Title in Arabic']")
    WebElement TitleInArabic;
    @FindBy(xpath = "//select[@class='assignment-type ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']")
    WebElement FieldType;
    @FindBy(xpath = "//option[contains(text(),'Number')]")
    WebElement Number;
    @FindBy(xpath = "//*[@id=\"required_field\"]\n")
    WebElement Required;
    @FindBy(xpath = "//form[@id='form.create_field']//div[@class='actions']")
    WebElement Create;
    @FindBy(xpath = "//i[@class='fa fa-remove action-lessons text-danger']")
    WebElement remove;
    @FindBy(css = "body.main-wrapper.landing-option1:nth-child(2) div.wrapper:nth-child(2) div.header-container div.sticky-wrapper.is-sticky header.main-header.sticky-1.inner-header div.container:nth-child(16) div.login-nav-button:nth-child(4) ul:nth-child(1) li:nth-child(3) a:nth-child(1) > i.fa.fa-unlock")
    WebElement LogOutBtn;
    @FindBy(xpath = "//div[@class='login-nav-button']//a[@class='ng-binding']")
    WebElement LogIn;
    @FindBy(id = "go_teachers_signup")
    WebElement TeacherRegistration;
    @FindBy(xpath = "//button[@class='ngdialog-button ngdialog-button-primary ng-binding']")
    WebElement DeleteButton;
    @FindBy(xpath = "//ng-include[@class='ng-scope']//option[2]")
    WebElement TextOption;
    @FindBy(xpath = "//option[contains(text(),'Text Area')]")
    WebElement TextAreaOption;
    @FindBy(xpath = "//option[contains(text(),'Attachment')]")
    WebElement AttachmentOption;
    @FindBy(xpath = "//option[contains(text(),'Date')]")
    WebElement DateOption;
    @FindBy(xpath = "//option[contains(text(),'Drop List')]")
    WebElement DropListOption;
    @FindBy(id = "option_0")
    WebElement DropListOption1;
    @FindBy(id = "option_1")
    WebElement DropListOption2;
    @FindBy(xpath = "//*[@id=\"form.create_field\"]/div[3]/select")
    WebElement FieldType2;

    public void ClickOnTeachers(){
        ClickButton(Teachers);
    }
    public void CheckCreateNotCLickAble(){
        ClickButton(CreateBtn);
    }
    public void CreateTeachers(WebDriver driver) throws InterruptedException, AWTException {
        TxtInElementTxt(Name,"YassmeenTeacher");
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        Email.sendKeys("Teach"+ randomInt +"@gmail.com");
        ClickButton(CreateBtn);
        Thread.sleep(2000);
        driver.switchTo().activeElement();
        ClickButton(CloseBtn);
        driver.navigate().refresh();
    }
    public void CheckStatus(WebDriver driver) throws InterruptedException {
        WebDriverWait wait;
        wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/section/div/div/div/div/div[1]/table/tbody/tr[1]/td[3]/button\n")));
        Boolean Display = driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/div/div/div[1]/table/tbody/tr[1]/td[3]/button\n")).isDisplayed();
        System.out.println("Element displayed is :"+ Display);
        ClickButton(Enrolled);
        ClickButton(CancelBtn);
        Thread.sleep(1000);
        ClickButton(Enrolled);
        ClickButton(ApproveBtn);
        Thread.sleep(1000);
        ClickButton(Enrolled);
        ClickButton(DeclineBtn);
    }
    public void ActionsView(WebDriver driver){
        ClickButton(ViewIcon);
        WebDriverWait wait;
        wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'skills')]")));
        Boolean Display = driver.findElement(By.xpath("//h2[contains(text(),'skills')]")).isDisplayed();
        System.out.println("Element displayed is :"+ Display);
    }
    public void ActionEdit(WebDriver driver) throws InterruptedException {
        ClickButton(Teachers);
        Thread.sleep(1000);
        ClickButton(EditIcon);
        WebDriverWait wait;
        wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='ng-binding ng-scope']")));
        Boolean Display = driver.findElement(By.xpath("//h3[@class='ng-binding ng-scope']")).isDisplayed();
        System.out.println("Element displayed is :"+ Display);
    }
    public void CheckUpdate() throws InterruptedException {
        TxtInElementTxt(EditName,"Test");
        ClickButton(SaveBtn);
        Thread.sleep(2000);
    }
    public void CheckDelete(WebDriver driver) {
        ClickButton(DeleteIcon);
        driver.switchTo().activeElement();
        ClickButton(CancelButton);
        ClickButton(DeleteIcon);
        ClickButton(DeleteButton);
    }

    public void SearchWithExistingName() throws InterruptedException {
        TxtInElementTxt(Search,"YASSMEENTEACHERTEST");
        Thread.sleep(2000);
        Search.clear();
        TxtInElementTxt(Search,"BLABLA");
        Thread.sleep(2000);
        Search.clear();
        TxtInElementTxt(SearchEmail,"TEACH240");
        Thread.sleep(3000);
        SearchEmail.clear();
        TxtInElementTxt(SearchEmail,"TEACH8888");
        Thread.sleep(2000);
        SearchEmail.clear();
    }
    public void CheckStatus() throws InterruptedException {
        ClickButton(Status);
        ClickButton(Approved);
        Thread.sleep(2000);
        ClickButton(Status);
        ClickButton(Declined);
        Thread.sleep(2000);
        ClickButton(Pending);
    }
    public void ManageRegistration() throws InterruptedException {
        Thread.sleep(2000);
        ScrollDown();
        ScrollDown();
        TxtInElementTxt(TitleInEnglish,"age");
        TxtInElementTxt(TitleInArabic,"السن");
        ClickButton(FieldType);
        ClickButton(Number);
        ClickButton(Required);
        ClickButton(Create);
//        Thread.sleep(1000);
//        ClickButton(remove);
    }
    public void Manage2(WebDriver driver)  throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(190, TimeUnit.SECONDS);
        Thread.sleep(1000);
        TxtInElementTxt(TitleInEnglish,"education");
        Thread.sleep(1000);
        TxtInElementTxt(TitleInArabic,"التعيلم");
        Thread.sleep(1000);
        ClickButton(FieldType2);
        Thread.sleep(1000);
        ClickButton(TextOption);
        Thread.sleep(1000);
        ClickButton(Required);
        ClickButton(Create);
        Thread.sleep(1000);
        TxtInElementTxt(TitleInEnglish,"Area");
        Thread.sleep(1000);
        TxtInElementTxt(TitleInArabic,"بالعربي");
        Thread.sleep(1000);
        ClickButton(FieldType2);
        Thread.sleep(1000);
        ClickButton(TextAreaOption);
        Thread.sleep(1000);
        ClickButton(Required);
        ClickButton(Create);
        Thread.sleep(1000);
        TxtInElementTxt(TitleInEnglish,"Attachment");
        Thread.sleep(1000);
        TxtInElementTxt(TitleInArabic,"مرفق");
        Thread.sleep(1000);
        ClickButton(FieldType2);
        Thread.sleep(1000);
        ClickButton(AttachmentOption);
        Thread.sleep(1000);
        ClickButton(Required);
        ClickButton(Create);
        Thread.sleep(1000);
        TxtInElementTxt(TitleInEnglish,"Date");
        Thread.sleep(1000);
        TxtInElementTxt(TitleInArabic,"الوقت");
        Thread.sleep(1000);
        ClickButton(FieldType2);
        Thread.sleep(1000);
        ClickButton(DateOption);
        Thread.sleep(1000);
        ClickButton(Required);
        ClickButton(Create);
        Thread.sleep(1000);
        TxtInElementTxt(TitleInEnglish,"Gender");
        Thread.sleep(1000);
        TxtInElementTxt(TitleInArabic,"اختر");
        Thread.sleep(1000);
        ClickButton(FieldType2);
        Thread.sleep(1000);
        ClickButton(DropListOption);
        Thread.sleep(1000);
        TxtInElementTxt(DropListOption1,"male");
        Thread.sleep(1000);
        TxtInElementTxt(DropListOption2,"female");
        Thread.sleep(1000);
        ClickButton(Required);
        ClickButton(Create);
    }
    public void Delete() throws InterruptedException {
        Thread.sleep(1000);
        ScrollDown();
        Thread.sleep(1000);
        ClickButton(remove);
        Thread.sleep(1000);
        ClickButton(remove);
        Thread.sleep(1000);
        ClickButton(remove);
        Thread.sleep(1000);
        ClickButton(remove);
        Thread.sleep(1000);
        ClickButton(remove);
        Thread.sleep(1000);
        ClickButton(remove);

    }
//    public void CheckIfApplied(WebDriver driver) throws InterruptedException {
//        Thread.sleep(1000);
//        ClickButton(LogOutBtn);
//        Thread.sleep(1000);
//        ClickButton(LogIn);
//        ClickButton(TeacherRegistration);
//        WebDriverWait wait;
//        wait = new WebDriverWait(driver,15);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //input[@placeholder='age']")));
//        Boolean Display = driver.findElement(By.xpath(" //input[@placeholder='age']")).isDisplayed();
//        System.out.println("Element displayed is :"+ Display);
//
//
//    }

}
