package Tests;

import Pages.LoginPage;
import Pages.PackagePage;
import Tests.TestBase;
import org.testng.annotations.Test;

import java.awt.*;

public class PackageTCs extends TestBase {
    LoginPage LoginObj;
    PackagePage PackageObj;
    @Test(priority = 1)
    public void LoginAsAdmin() throws InterruptedException, AWTException {
        PackageObj =new PackagePage(driver);
        LoginObj=new LoginPage(driver);
        LoginObj.ClickOnLoginIcon();
        LoginObj.ValidateMsg();
        LoginObj.UserLogin("academy@classera.com","class987",driver);
        PackageObj.CLickOnPackages();
        PackageObj.CreatePackages(driver);
        PackageObj.CreatePackageWithDiscount();

    }
    @Test(priority = 2)
    public void SearchForExistingAndNonExistingNames() throws InterruptedException {
        PackageObj =new PackagePage(driver);
        PackageObj.SearchForNames();
    }

}