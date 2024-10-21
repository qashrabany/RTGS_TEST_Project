package com.tranzFusion.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ClientToClient extends BasePage{
    public ClientToClient(WebDriver driver){
        super(driver);
    }
    public ClientToClient selectMirrorAccount(int index) {
        new Select(getWebElement(By.cssSelector("#contPlcHdrMasterHolder_FHddlAccountDebtor"))).selectByIndex(index);
        return this;

    }
    public ClientToClient selectTransactionType(int index){
        new Select(getWebElement(By.cssSelector("#contPlcHdrMasterHolder_FHddlTransTypeDebtor"))).selectByIndex(index);
        return this;
    }
    public ClientToClient selectPriority(int index){
        Actions actions = new Actions(driver);
        actions.moveToElement(getWebElement(By.id("contPlcHdrMasterHolder_FHddlPriority"))).perform();
        waitForElement((By.id("contPlcHdrMasterHolder_FHddlPriority")));
        new Select(getWebElement(By.id("contPlcHdrMasterHolder_FHddlPriority"))).selectByIndex(index);
        return this;
    }
    public ClientToClient selectCustomerOffice(int index){
        new Select(getWebElement(By.id("contPlcHdrMasterHolder_FHddlBranchID"))).selectByIndex(index);
        return this;
    }

}
