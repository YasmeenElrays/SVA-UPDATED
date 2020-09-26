package Tests;

import Pages.LandingPage;
import Pages.LoginPage;
import Tests.TestBase;
import org.testng.annotations.Test;

import java.awt.*;

public class LandingPageTCs extends TestBase {
    LandingPage LandingObj;
    LoginPage LoginObj;


    @Test(priority = 1)
    public void CheckBrowseCourses() {
        LandingObj = new LandingPage(TestBase.driver);
        LandingObj.CheckBrowseCourses(TestBase.driver);
    }

    @Test(priority = 2)
    public void ClickOnLogoInHeader() throws InterruptedException {
        LandingObj = new LandingPage(TestBase.driver);
        LandingObj.ClickOnLogo();
//        System.out.println(LandingObj.RegisterBtn.getText());
//        Assert.assertEquals(LandingObj.RegisterBtn.getText(),"REGISTER");
    }
    @Test(priority = 3)
    public void SearchCourses() throws InterruptedException, AWTException {
        LandingObj = new LandingPage(TestBase.driver);
        LandingObj.Search(TestBase.driver);

    }
    @Test(priority = 4)
    public void CheckCourseFilter() throws InterruptedException {
        LandingObj = new LandingPage(TestBase.driver);
        LandingObj.CourseFilter(TestBase.driver);
    }
    @Test(priority = 5)
    public void  CourseDetails() throws InterruptedException, AWTException {
        LandingObj = new LandingPage(TestBase.driver);
        LandingObj.CLickOnCourse(TestBase.driver);

    }


}
