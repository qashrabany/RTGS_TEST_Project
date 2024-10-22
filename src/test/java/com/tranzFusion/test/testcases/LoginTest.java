package com.tranzFusion.test.testcases;
import com.tranzFusion.test.pages.HomePage;
import com.tranzFusion.test.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;




public class LoginTest extends BaseTest{

    @Test
    public void doLoginWithUserIdShouldFail() {
        LoginPage loginPage =page.getInstance(LoginPage.class);
        loginPage=loginPage
                .enterUserId("ddddd")
                .clickLoginLinkBtn();
        Assert.assertTrue(loginPage.hasError());

    }
    @Test
    public void doLoginWithPasswordShouldFail() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        loginPage = loginPage
                .enterPassword("fddsfds")
                .clickLoginLinkBtn();
        Assert.assertTrue(loginPage.hasError());
    }

    @Test
    public void doLoginShouldFail() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        loginPage = loginPage
                .clickLoginLinkBtn();
        Assert.assertTrue(loginPage.hasError());
    }

    @Test
    public void doLoginShouldSucceed() {
        LoginPage loginPage= page.getInstance(LoginPage.class);
                HomePage homePage = loginPage
                .enterUserId(getUserId())
                .enterPassword(getPassword())
                .clickLoginBtn();
        Assert.assertTrue(homePage.hasLogoutLink());
    }


}


