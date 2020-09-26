package Tests;

import Pages.LoginPage;
import Pages.TeacherPage;
import Tests.TestBase;
import org.testng.annotations.Test;

import java.awt.*;

public class TeachersTCs extends TestBase {

    LoginPage LoginObj;
    TeacherPage TeacherObj;

    @Test(priority = 1)
    public void LoginAsAdmin() throws InterruptedException, AWTException {
        TeacherObj = new TeacherPage(driver);
        LoginObj=new LoginPage(driver);
        LoginObj.ClickOnLoginIcon();
        LoginObj.ValidateMsg();
        LoginObj.UserLogin("academy@classera.com","class987",driver);
        TeacherObj.ClickOnTeachers();
        TeacherObj.CheckCreateNotCLickAble();
        TeacherObj.CreateTeachers(driver);

//       System.out.println(TeacherObj.TeacherMsg.getText());
//       Assert.assertEquals(TeacherObj.TeacherMsg.getText(),"Your teacher have been created please make sure to copy the password and send it to him");
    }
    @Test(priority = 2)
    public void CheckTeacherStatus() throws InterruptedException {
        TeacherObj = new TeacherPage(driver);
        TeacherObj.CheckStatus(driver);

    }
    @Test(priority = 3)
    public void CheckActions() throws InterruptedException {
        TeacherObj = new TeacherPage(driver);
        TeacherObj.ActionsView(driver);
        TeacherObj.ActionEdit(driver);
    }
    @Test(priority =4)
    public void CheckUpdateFunction() throws InterruptedException {
        TeacherObj = new TeacherPage(driver);
        TeacherObj.CheckUpdate();
    }
    @Test(priority = 5)
    public void CheckDeleteFunction(){
        TeacherObj = new TeacherPage(driver);
        TeacherObj.CheckDelete(driver);
    }
    @Test(priority = 6)
    public void Search() throws InterruptedException {
        TeacherObj = new TeacherPage(driver);
        TeacherObj.SearchWithExistingName();
    }
    @Test(priority = 7)
    public void Status() throws InterruptedException {
        TeacherObj = new TeacherPage(driver);
        TeacherObj.CheckStatus();
    }
    @Test(priority = 8)
    public void ManageRegistrationCheck() throws InterruptedException {
        TeacherObj = new TeacherPage(driver);
        TeacherObj.ManageRegistration();
        TeacherObj.Manage2(driver);
    }
    @Test(priority = 9)
    public void DeleteFields() throws InterruptedException {
        TeacherObj = new TeacherPage(driver);
        TeacherObj.Delete();

    }
    @Test(priority = 10,enabled = false)
    public void CheckIfApplied() throws InterruptedException {
        TeacherObj = new TeacherPage(driver);

        //TeacherObj.CheckIfApplied(driver);



    }
}

