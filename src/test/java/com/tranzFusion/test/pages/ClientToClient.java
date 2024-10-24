package com.tranzFusion.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ClientToClient extends BasePage {
    public ClientToClient(WebDriver driver) {
        super(driver);
    }

    public ClientToClient selectMirrorAccount(int index) {
        Actions actions = new Actions(driver);
        actions.moveToElement(getWebElement(By.id("contPlcHdrMasterHolder_FHddlAccountDebtor"))).perform();
        waitForElement((By.id("contPlcHdrMasterHolder_FHddlAccountDebtor")));
        new Select(getWebElement(By.cssSelector("#contPlcHdrMasterHolder_FHddlAccountDebtor"))).selectByIndex(index);
        return this;

    }

    public ClientToClient selectTransactionType(int index) {
        Actions actions = new Actions(driver);
        actions.moveToElement(getWebElement(By.id("contPlcHdrMasterHolder_FHddlTransTypeDebtor"))).perform();
        waitForElement((By.id("contPlcHdrMasterHolder_FHddlTransTypeDebtor")));
        new Select(getWebElement(By.cssSelector("#contPlcHdrMasterHolder_FHddlTransTypeDebtor"))).selectByIndex(index);
        return this;
    }

    public ClientToClient selectPriority(int index) {
        Actions actions = new Actions(driver);
        actions.moveToElement(getWebElement(By.id("contPlcHdrMasterHolder_FHddlPriority"))).perform();
        waitForElement((By.id("contPlcHdrMasterHolder_FHddlPriority")));
        new Select(getWebElement(By.id("contPlcHdrMasterHolder_FHddlPriority"))).selectByIndex(index);
        return this;
    }

    public ClientToClient selectCustomerOffice(int index) {
        Actions actions = new Actions(driver);
        actions.moveToElement(getWebElement(By.id("contPlcHdrMasterHolder_FHddlBranchCreditor"))).perform();
        waitForElement((By.id("contPlcHdrMasterHolder_FHddlBranchCreditor")));
        new Select(getWebElement(By.id("contPlcHdrMasterHolder_FHddlBranchCreditor"))).selectByIndex(index);
        return this;
    }

    public ClientToClient fillCustomerAccountNo(String account){
        Actions actions = new Actions(driver);
        actions.moveToElement(getWebElement(By.id("contPlcHdrMasterHolder_TFtxtCustAcNoDebtor"))).perform();
        waitForElement((By.id("contPlcHdrMasterHolder_TFtxtCustAcNoDebtor")));
        getWebElement(By.cssSelector("#contPlcHdrMasterHolder_TFtxtCustAcNoDebtor")).sendKeys((account));
        return this;
    }

    public ClientToClient selectCountry(int index) {
        Actions actions = new Actions(driver);
        actions.moveToElement(getWebElement(By.id("contPlcHdrMasterHolder_FHddlCountryDebitor"))).perform();
        waitForElement((By.id("contPlcHdrMasterHolder_FHddlCountryDebitor")));
        new Select(getWebElement(By.id("contPlcHdrMasterHolder_FHddlCountryDebitor"))).selectByIndex(index);
        return this;
    }
    public ClientToClient selectCity(int index) {
        Actions actions = new Actions(driver);
        actions.moveToElement(getWebElement(By.id("contPlcHdrMasterHolder_FHddlCityDebitor"))).perform();
        waitForElement((By.id("contPlcHdrMasterHolder_FHddlCityDebitor")));
        new Select(getWebElement(By.id("contPlcHdrMasterHolder_FHddlCityDebitor"))).selectByIndex(index);
        return this;
    }


    public ClientToClient insertAmount(double amount) {
        Actions actions = new Actions(driver);
        actions.moveToElement(getWebElement(By.id("contPlcHdrMasterHolder_TFtxtAmountDebtor"))).perform();
        waitForElement((By.id("contPlcHdrMasterHolder_TFtxtAmountDebtor")));
        getWebElement(By.cssSelector("#contPlcHdrMasterHolder_TFtxtAmountDebtor")).sendKeys(Double.toString(amount));
        return this;
    }

    public ClientToClient insertAgentInstructions(String intruct) {
        try {
            Thread.sleep(1000);
            By agentInstructionClientToClient = By.id("contPlcHdrMasterHolder_TFtxtInstructionForAgent");
            Actions actions = new Actions(driver);
            actions.moveToElement(getWebElement(agentInstructionClientToClient)).perform();
            getWebElement(agentInstructionClientToClient).click();
            getWebElement(agentInstructionClientToClient).sendKeys(intruct);
            return this;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }}

    public ClientToClient insertParticulars(String Particulars ){
        try {
            Thread.sleep(1000);
            By particularsClientToClient = By.id("contPlcHdrMasterHolder_TFtxtNarrationDebtor");
            Actions actions = new Actions(driver);
            actions.moveToElement(getWebElement(particularsClientToClient )).perform();
            getWebElement(particularsClientToClient ).sendKeys(Particulars);
            return this;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }}

    public ClientToClient selectBank(int index){
        new Actions(driver).moveToElement(getWebElement(By.id("contPlcHdrMasterHolder_FHddlBankCreditor"))).perform();
        waitForElement(By.id("contPlcHdrMasterHolder_FHddlBankCreditor"));
        new Select(getWebElement(By.id("contPlcHdrMasterHolder_FHddlBankCreditor"))).selectByIndex(index);
        return this;
    }
    public ClientToClient selectMirrorAccount2(int index) {
        new Actions(driver).moveToElement(getWebElement(By.id("contPlcHdrMasterHolder_FHddlBBAccountCreditor"))).perform();
        waitForElement(By.id("contPlcHdrMasterHolder_FHddlBBAccountCreditor"));
        new Select(getWebElement(By.cssSelector("#contPlcHdrMasterHolder_FHddlBBAccountCreditor"))).selectByIndex(index);
        return this;
    }
    public ClientToClient selectOffice(int index) {
        new Actions(driver).moveToElement(getWebElement(By.id("contPlcHdrMasterHolder_FHddlBranchCreditor"))).perform();
        waitForElement(By.id("contPlcHdrMasterHolder_FHddlBranchCreditor"));
        new Select(getWebElement(By.cssSelector("#contPlcHdrMasterHolder_FHddlBranchCreditor"))).selectByIndex(index);
        return this;
    }
    public ClientToClient insertCustomerAccountNo(String CusAccNo){
        try {
            Thread.sleep(1000);
            By particularsClientToClient = By.id("contPlcHdrMasterHolder_TFtxtCustomerAcNoCreditor");
            Actions actions = new Actions(driver);
            actions.moveToElement(getWebElement(particularsClientToClient)).perform();
            getWebElement(particularsClientToClient).sendKeys(CusAccNo);
            return this;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public ClientToClient insertCustomerAddressLine(String CusAddressLine){
        try {
            Thread.sleep(1000);
            By particularsClientToClient = By.id("contPlcHdrMasterHolder_TFtxtCustomerAdrLine");
            Actions actions = new Actions(driver);
            actions.moveToElement(getWebElement(particularsClientToClient)).perform();
            getWebElement(particularsClientToClient).sendKeys(CusAddressLine);
            return this;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public ClientToClient selectCountry2(int index) {
        new Actions(driver).moveToElement(getWebElement(By.id("contPlcHdrMasterHolder_FHddlCountry"))).perform();
        waitForElement(By.id("contPlcHdrMasterHolder_FHddlCountry"));
        new Select(getWebElement(By.cssSelector("#contPlcHdrMasterHolder_FHddlCountry"))).selectByIndex(index);
        return this;
    }
    public ClientToClient selectCity2(int index) {
        new Actions(driver).moveToElement(getWebElement(By.id("contPlcHdrMasterHolder_FHddlCity"))).perform();
        waitForElement(By.id("contPlcHdrMasterHolder_FHddlCity"));
        new Select(getWebElement(By.cssSelector("#contPlcHdrMasterHolder_FHddlCity"))).selectByIndex(index);
        return this;
    }
    public ClientToClient clickOkBtn() {
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector("#contPlcHdrMasterHolder_btnOk"))).perform();
        getWebElement(By.cssSelector("#contPlcHdrMasterHolder_btnOk")).click();
        return this;

    }
}
