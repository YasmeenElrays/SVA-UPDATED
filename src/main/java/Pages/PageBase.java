package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase{
    //create constructor
    protected WebDriver driverAll;
    public JavascriptExecutor scroll ;
    public PageBase(WebDriver driver  ){
        PageFactory.initElements(driver,this);

    }
    //Click button
    protected static void  ClickButton ( WebElement button){
        button.click();
    }
    //EnterTextInFields
    protected static void TxtInElementTxt(WebElement EnterTxt, String value)
    {
        EnterTxt.sendKeys(value);
    }
    public void ScrollDown(){
        scroll.executeScript("window.scrollBy(0,350)");
    }
}