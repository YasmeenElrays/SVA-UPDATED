package Pages;

import Pages.PageBase;
import gherkin.lexer.Th;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PackagePage extends PageBase {
    public PackagePage(WebDriver driver) {
        super(driver);
        scroll = (JavascriptExecutor)driver;
    }
    @FindBy(xpath = "//a[contains(text(),'Packages')]")
    WebElement Packages;
    @FindBy(xpath = "//div[@class='form-group has-feedback']//input[@placeholder='Title']")
    WebElement EnglishTitle;
    @FindBy(xpath = "//input[@placeholder='Title (عربي)']")
    WebElement ArabicTitle;
    @FindBy(xpath = "//input[@placeholder='Price']")
    WebElement Price;
    @FindBy(id = "starting_date")
    WebElement StartingDate;
    @FindBy(id="ending_date")
    WebElement EndingDate;
    @FindBy(xpath = "//button[@class='btn btn-success submit-btn ng-binding']")
    WebElement CreateBtn;
    @FindBy(id="discount")
    WebElement Discount;
    @FindBy(xpath = "//input[@placeholder='Discount %']")
    WebElement DiscountField;
    @FindBy(xpath = "//div[@class='filter-cell ng-scope s12 last']//input[@placeholder='Title']")
    WebElement Title;


    public void CLickOnPackages(){
        ClickButton(Packages);
    }
    public void CreatePackages(WebDriver driver) throws InterruptedException {
        TxtInElementTxt(EnglishTitle, "NewPackage");
        TxtInElementTxt(ArabicTitle, "جديد");
        TxtInElementTxt(Price, "100");
        ScrollDown();
//        DateFormat dateFormat = new SimpleDateFormat("dd");
//        Date date = new Date();
//        String date1 = dateFormat.format(date);
        ClickButton(StartingDate);
//        List<WebElement> dates = driver.findElements(By.className("ng-binding"));
//        int total = dates.size();
//        for (int i = 0; i < total; i++) {
//            String Date = dates.get(i).getText();
//            if (Date.equals(date1)) {
//                dates.get(i+1).click();
//                return;
//            }
        Thread.sleep(2000);
        ScrollDown();
//            DateFormat dateFormat2 = new SimpleDateFormat("dd");
//            Date date2 = new Date();
//            String date3 = dateFormat2.format(date2);
        ClickButton(EndingDate);
//            List<WebElement> dates2 = driver.findElements(By.className("ng-binding active now"));
//            int total2 = dates2.size();
//            for (int g = 0; g < total2; g++) {
//                String Date2 = dates2.get(g).getText();
//                if (Date2.equals(date3)) {
//                    dates.get(g+1).click();
//                    return;
//                }
//
//
//        }
        ClickButton(CreateBtn);

    }
    public void CreatePackageWithDiscount() throws InterruptedException {
        Thread.sleep(1000);
        TxtInElementTxt(EnglishTitle, "NewPackageWithDiscount");
        TxtInElementTxt(ArabicTitle, "جديد");
        ClickButton(Discount);
        TxtInElementTxt(DiscountField,"50");
        ScrollDown();
        ClickButton(StartingDate);
        Thread.sleep(2000);
        ScrollDown();
        ClickButton(EndingDate);
        ClickButton(CreateBtn);

    }
    public void SearchForNames() throws InterruptedException {
        TxtInElementTxt(Title,"NewPackageWithDiscount");
        Thread.sleep(1000);
        Title.clear();
        TxtInElementTxt(Title,"bla bla bla ");
    }

}

