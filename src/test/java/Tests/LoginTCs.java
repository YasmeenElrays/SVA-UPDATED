package Tests;

import Pages.LoginPage;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTCs extends TestBase {
    LoginPage LoginObj;

    @Test(priority = 1)
    public void UserCanLoginSuccessFully(){
        LoginObj =new LoginPage(driver);
        LoginObj.ClickOnLoginIcon();
        LoginObj.ValidateMsg();
        System.out.println(LoginObj.ExpectedErrorMessage.getText());
        Assert.assertEquals(LoginObj.ExpectedErrorMessage.getText(),"Please fill the required fields");
        LoginObj.UserLogin("academy@classera.com","class987",driver);
    }
    @Test(priority = 2)
    public void UserCanLoginWithClassera() throws InterruptedException {
        LoginObj=new LoginPage(driver);
        LoginObj.UserLoginWithClassera("demos223","12sudo4",driver);
    }
    @Test(priority = 3)
    public void UserSignUp() throws InterruptedException {
        LoginObj=new LoginPage(driver);
        LoginObj.SignUp();
        LoginObj.ValidateMsgSignUp();
        System.out.println(LoginObj.ExpectedErrorMessage2.getText());
        Assert.assertEquals(LoginObj.ExpectedErrorMessage2.getText(),"You need to fill all required fields");
    }
    @Test(priority = 4)
    public void CheckMsgWhenPasswordDoesNotMatch() throws InterruptedException {
        LoginObj=new LoginPage(driver);
        LoginObj.CheckMsgWhenPWDOESNotMatch();
        System.out.println(LoginObj.PasswordMsg.getText());
        Assert.assertEquals(LoginObj.PasswordMsg.getText(),"Confirm password doesn't match");
    }
    @Test(priority = 5)
    public void CheckMsgWhenEmailExits() throws InterruptedException {
        LoginObj=new LoginPage(driver);
        LoginObj.CheckEmailIsExistBefore(driver);
        System.out.println(LoginObj.EmailMsg.getText());
        Assert.assertEquals(LoginObj.EmailMsg.getText(),"Email already exist");
    }

    @Test(priority = 6)
    public void UserSignUpSuccessfully() throws InterruptedException {
        LoginObj=new LoginPage(driver);
        LoginObj.UserSignUp(driver);
    }
    @Test(priority = 7)
    public void TeacherRegistrationSuccessfully() throws InterruptedException {
        LoginObj=new LoginPage(driver);
        LoginObj.TeacherRegistration();
        System.out.println(LoginObj.ApproveMsg.getText());
        Assert.assertEquals(LoginObj.ApproveMsg.getText(),"Thanks! Your account is pending approval now");
    }
    @Test(priority = 8)
    public void ForgetPasswordTest() throws InterruptedException {
        LoginObj=new LoginPage(driver);
        LoginObj.ForgetPassword();
    }
}

