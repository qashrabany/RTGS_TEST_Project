package com.tranzFusion.test.pages;

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


    public  FinToFin clicktoFinbtn()  {

        getWebElement(By.cssSelector("#MenuTransactions")).click();
        try {
            Thread.sleep(3000);
            getWebElement(By.id("HyperLinkTransB2B")).click();
            return getInstance(FinToFin.class);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }




}
