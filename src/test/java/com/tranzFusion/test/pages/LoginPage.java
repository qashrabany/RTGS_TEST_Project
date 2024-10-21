package com.tranzFusion.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;



public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage enterUserId(String userid){
        getWebElement(By.cssSelector("#txtUserName")).sendKeys(userid);
        return this;
    }

    public LoginPage enterPassword(String password){
        getWebElement(By.cssSelector("#txtUserPassword")).sendKeys(password);
        return this;
    }

    public HomePage clickLoginBtn(){
        getWebElement(By.cssSelector("#btnLogIn")).click();
        return getInstance(HomePage.class);

    }
    public LoginPage clickLoginLinkBtn(){
        getWebElement(By.cssSelector("#btnLogIn")).click();
        return this;
    }

//error
    public boolean hasError() {
        return getWebElements(By.className("modal-body")).size() > 0;
    }

    public HomePage dologin(String user, String pass){
       return enterUserId(user)
               .enterPassword(pass).
               clickLoginBtn();

    }


}
