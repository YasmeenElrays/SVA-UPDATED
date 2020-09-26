package Tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class TestBase extends AbstractTestNGCucumberTests {

    public static WebDriver driver;
    @BeforeSuite
    @Parameters({"browser"})
    public void StartDriver( @Optional("Chrome") String browername)
    {
        if (browername.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(190, TimeUnit.SECONDS);
            driver.navigate().to("https://academy.classera.com/");
        }
        else if (browername.equalsIgnoreCase("Chrome_headless")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--window-size=1920,1080");
            driver=new ChromeDriver(options);
            //options.setHeadless(true);
            System.out.println("Title of the page"+driver.getTitle());
        }

    }
//     public void StartDriver( @Optional("Chrome") String browername) {
//         System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
//         driver = new ChromeDriver();
//         driver.manage().window().maximize();
//         driver.manage().deleteAllCookies();
//         driver.manage().timeouts().implicitlyWait(190, TimeUnit.SECONDS);
//         driver.navigate().to("https://academy.classera.com/");
//     }


    @AfterSuite
    public void QuitDriver(){

        // driver.quit();
    }


}
