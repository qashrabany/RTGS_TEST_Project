package com.tranzFusion.test.pages;

import com.tranzFusion.test.utill.General;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class UserManagementPage extends BasePage {
    public UserManagementPage(WebDriver driver) {
        super(driver);
    }


    public UserManagementPage fillUserID(String userid) {
        getWebElement(By.id("contPlcHdrMasterHolder_TFtxtUserID")).sendKeys(userid);
        return this;
    }

    public UserManagementPage clickOutside() {
        getWebElement(By.xpath("//body[1]/form[1]/section[2]/section[1]/section[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/section[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).click();
        return this;
    }

        public UserManagementPage fillUserName(String username) {
        By userName= By.xpath("//input[@id='contPlcHdrMasterHolder_TFtxtUserName']");
        waitForElement(userName);
        General.waitForSeeText();
        getWebElement(userName).click();
        getWebElement(userName).sendKeys(username);

        return this;
    }


    public UserManagementPage SelectHomeOffice(String value) {
        // Wait for the dropdown element to be present and visible
        WebElement homeOfficeDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='contPlcHdrMasterHolder_FHddlParticipantBranch']")));
        // Scroll into view if necessary
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", homeOfficeDropdown);

        // Create a Select object
        Select select = new Select(homeOfficeDropdown);

        // Validate if the value exists in the dropdown options
        boolean valueExists = select.getOptions().stream()
                .anyMatch(option -> option.getAttribute("value").equals(value));

        if (!valueExists) {
            throw new IllegalArgumentException("Value '" + value + "' is not present in the dropdown.");
        }

        // Select the option by value
        select.selectByValue(value);

        return this;
    }


//    public UserManagementPage SelectHomeCenter(int index) {
//
//
//        new Select(getWebElement(By.id("contPlcHdrMasterHolder_FHddlBranchCenter"))).selectByIndex(index);
//        waitForElement(By.id("contPlcHdrMasterHolder_FHddlBranchCenter"));
//
//        return this;
//    }

    public UserManagementPage selectHomeOffice(String value) {
        // Wait for the dropdown element to be present
        waitForElement(By.id("contPlcHdrMasterHolder_FHddlParticipantBranch"));

        // Get the dropdown element once
        WebElement homeCenterDropdown = getWebElement(By.id("contPlcHdrMasterHolder_FHddlParticipantBranch"));

        // Create a Select instance for the dropdown
        Select dropdown = new Select(homeCenterDropdown);

        // Select the option by visible text
        dropdown.selectByVisibleText(value);

        return this;
    }



    public UserManagementPage SelectHomeCenter(int index) {
        // Wait for the dropdown element to be present
        waitForElement(By.id("contPlcHdrMasterHolder_FHddlBranchCenter"));

        // Get the dropdown element once
        WebElement homeCenterDropdown = getWebElement(By.id("contPlcHdrMasterHolder_FHddlBranchCenter"));

        // Select the option by index
        new Select(homeCenterDropdown).selectByIndex(index);

        return this;
    }


    public UserManagementPage fillUserDetails(String userDetail) {
        General.waitForSeeText();
        getWebElement(By.id("contPlcHdrMasterHolder_TFtxtUserDesc")).sendKeys(userDetail);
        return this;
    }


    public UserManagementPage fillEmployeeCode	(String employeeCode) {

        General.waitForSeeText();
        getWebElement(By.id("contPlcHdrMasterHolder_TFtxtEmployeecode")).sendKeys(employeeCode);
        return this;
    }

    public UserManagementPage fillDesignation	(String designation) {

        General.waitForSeeText();
        getWebElement(By.id("contPlcHdrMasterHolder_TFtxtDesignation")).sendKeys(designation);
        return this;
    }




    public UserManagementPage AdministratorRole () {

            By AdministratorRoleHeadOffice = By.cssSelector("#contPlcHdrMasterHolder_tfChkSMSAdminRole");
            Actions actions = new Actions(driver);
            General.waitForSeeText();
            actions.moveToElement(getWebElement(AdministratorRoleHeadOffice)).perform();
            getWebElement(AdministratorRoleHeadOffice).click();

            return this;
    }


    public UserManagementPage SelectMirrorAccount(int index) {
        waitForElement(By.cssSelector("#contPlcHdrMasterHolder_FHddlAccountNo"));
        WebElement mirrorAccountDropdown = getWebElement(By.cssSelector("#contPlcHdrMasterHolder_FHddlAccountNo"));
        new Select(mirrorAccountDropdown).selectByIndex(index);
        return this;
    }

    //    public UserManagementPage SelectTransactionType (int index) {
//        waitForElement(By.id("contPlcHdrMasterHolder_FHddlTransType"));
//        new Actions(driver).moveToElement(driver.findElement(By.id("contPlcHdrMasterHolder_FHddlTransType"))).perform();
//        WebElement TransactionTypeDropdown = getWebElement(By.id("contPlcHdrMasterHolder_FHddlTransType"));
//        new Select(TransactionTypeDropdown).selectByIndex(index);
//        return this;
//   }
    public UserManagementPage SelectTransactionType(int index) {
        // Define the locator for the Transaction Type dropdown
        By transactionTypeLocator = By.id("contPlcHdrMasterHolder_FHddlTransType");

        // Wait for the Transaction Type dropdown to be present
        waitForElement(transactionTypeLocator);

        // Move to the dropdown element and select by index
        Actions actions = new Actions(driver);
        WebElement transactionTypeDropdown = getWebElement(transactionTypeLocator);
        actions.moveToElement(transactionTypeDropdown).perform();

        new Select(transactionTypeDropdown).selectByIndex(index);

        return this;
    }


    public UserManagementPage fillMakeLimit(long makerLimit) {
        By makerLimitLocator = By.id("contPlcHdrMasterHolder_TFtxtMakerLimit");

        waitForElement(makerLimitLocator);

        Actions actions = new Actions(driver);
        WebElement makerLimitField = getWebElement(makerLimitLocator);
        actions.moveToElement(makerLimitField).perform();
        makerLimitField.sendKeys(String.valueOf(makerLimit));

        return this;
    }


    public UserManagementPage fillAuthorizeLimit(long authorizeLimit) {

        General.waitForSeeText();
        By enterAuthorizeLimit = By.id("contPlcHdrMasterHolder_TFtxtAuthorizeLimit");
            Actions actions = new Actions(driver);
            actions.moveToElement(getWebElement(enterAuthorizeLimit)).perform();
            getWebElement(enterAuthorizeLimit).clear();
            getWebElement(enterAuthorizeLimit).sendKeys(String.valueOf(authorizeLimit));
            return this;
    }

    public UserManagementPage fillTransmitLimit(long transmitLimit) {
        General.waitForSeeText();
        By fillTLimit = By.id("contPlcHdrMasterHolder_TFtxtVerifyLimit");
        waitForElement(fillTLimit);

        Actions actions = new Actions(driver);
        actions.moveToElement(getWebElement(fillTLimit)).perform();

        getWebElement(fillTLimit).clear();
        getWebElement(fillTLimit).sendKeys(String.valueOf(transmitLimit));

        return this;
    }

    public UserManagementPage ClickAddLimitOkButton() {
        General.waitForSeeText();
        new Actions(driver).moveToElement(driver.findElement(By.id("contPlcHdrMasterHolder_btnAdd"))).perform();
        getWebElement(By.id("contPlcHdrMasterHolder_btnAdd")).click();
        return this;
    }


    public UserManagementPage fillPassWord(String password) {
        By password1 = By.xpath("//input[@id='contPlcHdrMasterHolder_TFtxtPassword']");
        waitForElement(password1);
        Actions actions = new Actions(driver);
        actions.moveToElement(getWebElement(password1)).perform();
        getWebElement(password1).sendKeys(password);
        return this;
    }

    public UserManagementPage fillConfirmPassWord(String confirmPassword) {
        By cPassword = By.xpath("//input[@id='contPlcHdrMasterHolder_TFtxtConPassword']");
        waitForElement(cPassword);
        Actions actions = new Actions(driver);
        actions.moveToElement(getWebElement(cPassword)).perform();
        getWebElement(cPassword).sendKeys(confirmPassword);
        return this;
    }

    public UserManagementPage SelectUserStatus (int index) {
        waitForElement(By.id("contPlcHdrMasterHolder_FHddlStatus"));
        new Actions(driver).moveToElement(driver.findElement(By.id("contPlcHdrMasterHolder_FHddlStatus"))).perform();
        WebElement TransactionTypeDropdown = getWebElement(By.id("contPlcHdrMasterHolder_FHddlStatus"));
        new Select(TransactionTypeDropdown).selectByIndex(index);
        return this;
    }
    public UserManagementPage ClickCreateUserOkButton() {
        General.waitForSeeText();
        By userCreateOKBtnLocator = By.id("contPlcHdrMasterHolder_btnOK");
        Actions actions = new Actions(driver);
        waitForElement(userCreateOKBtnLocator);
        actions.moveToElement(getWebElement(userCreateOKBtnLocator)).perform();
        getWebElement(userCreateOKBtnLocator).click();
        return this;
    }
    public boolean hasSuccessMsg(String expectedMessage) {
        // Get the actual message from the web element
        String actualMessage = getWebElement(By.cssSelector("div[class='modal-body'] p")).getText();

        // Print the actual message for visibility
        System.out.println("Actual success message: " + actualMessage);

        // Return whether the actual message matches the expected message
        return actualMessage.equals(expectedMessage);
    }



    public boolean hasUnauthorizedMsg() {
        try {
            // Find the modal body element
            WebElement modalBody = driver.findElement(By.xpath("//p[normalize-space()='Exception has occurred : Unauthorized Data Found']"));
            // Get the text of all <p> elements within the modal body
            String modalText = modalBody.getText();
            // Check if the specific unauthorized message is present
            return modalText.contains("Exception has occurred : Unauthorized Data Found");
        } catch (NoSuchElementException e) {
            // If modal body is not found, return false
            return false;
        }
    }

    public boolean hasErrorMsg(String expectedMessage) {
        // Get the actual message from the web element
        String actualMessage = getWebElement(By.xpath("//div[@class='modal-body']")).getText();

        // Print the actual message for visibility
        System.out.println("Actual error message: " + actualMessage);

        // Return whether the actual message matches the expected message
        return actualMessage.equals(expectedMessage);
    }


}





