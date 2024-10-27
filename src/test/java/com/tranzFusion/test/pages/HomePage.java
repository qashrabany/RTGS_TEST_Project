package com.tranzFusion.test.pages;

import com.tranzFusion.test.utill.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public boolean hasLogoutLink(){
        return getWebElements(By.cssSelector("#LogOutImg")).size()>0;
    }



    public  UserManagementPage ClickUserManagement (int index) {
        new Select(getWebElement(By.cssSelector("//a[contains(@class,'dropdown-toggle')]//span[contains(text(),'Administration')]"))).selectByIndex(index);
        waitForElement(By.cssSelector("//a[contains(@class,'dropdown-toggle')]//span[contains(text(),'Administration')]"));

        return getInstance(UserManagementPage.class);


    }

//    public  UserManagementPage ClickUserManagement1 () {
//        getWebElement(By.cssSelector("//a[contains(@class,'dropdown-toggle')]//span[contains(text(),'Administration')]")).click();
//        General.waitForSeeText();
//
//
//        waitForElement(By.cssSelector("//a[contains(@class,'dropdown-toggle')]//span[contains(text(),'Administration')]"));
//        getWebElement(By.xpath("//a[@id='HyperLinkCreateUser']")).click();
//        waitForElement(By.cssSelector("//a[contains(@class,'dropdown-toggle')]//span[contains(text(),'Administration')]"));
//
//        return getInstance(UserManagementPage.class);
//
//    }

    public UserManagementPage ClickUserManagement1() {
        // Define locators
        By administrationDropdown = By.cssSelector("a.dropdown-toggle span");
        By createUserLink = By.id("HyperLinkCreateUser");

        // Click on the Administration dropdown
        getWebElement(administrationDropdown).click();
        General.waitForSeeText();

        // Wait for the dropdown to be present
        waitForElement(administrationDropdown);

        // Click on the Create User link
        getWebElement(createUserLink).click();

        // Wait again for the dropdown to ensure the navigation is complete
        waitForElement(administrationDropdown);

        // Return an instance of UserManagementPage
        return getInstance(UserManagementPage.class);
    }


    public  FinToFin clicktoFinbtn()  {

        getWebElement(By.cssSelector("#MenuTransactions")).click();
        try {
            Thread.sleep(5000);
            getWebElement(By.id("HyperLinkTransB2B")).click();
            return getInstance(FinToFin.class);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }




}
