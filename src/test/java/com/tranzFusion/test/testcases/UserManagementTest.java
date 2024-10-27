package com.tranzFusion.test.testcases;

import com.tranzFusion.test.pages.FinToFin;
import com.tranzFusion.test.pages.LoginPage;
import com.tranzFusion.test.pages.UserManagementPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserManagementTest  extends BaseTest {

    public String userId; // Class-level variable to store the user ID

    @Test(priority = 1)
    public void UserCreationShouldSucceed1() {
        // Assign the user ID to the class variable
        userId = "Seita43";

        UserManagementPage userCreation = page.getInstance(LoginPage.class)
                .dologin(getUserId(), getPassword())
                .ClickUserManagement1()
                .fillUserID(userId)
                .clickOutside()
                .fillUserName("u")
                .SelectHomeOffice("0001")
                .fillDesignation("jhh")
                .SelectHomeCenter(2)
                .fillUserDetails("Test12234667676")
                .fillEmployeeCode("test123")
                .AdministratorRole()
                .SelectMirrorAccount(1)
                .SelectTransactionType(5)
                .fillMakeLimit(999999999999L)
                .fillAuthorizeLimit(999999999999L)
                .fillTransmitLimit(999999999999L)
                .ClickAddLimitOkButton()
                .fillPassWord("11")
                .fillConfirmPassWord("11")
                .SelectUserStatus(1)
                .ClickCreateUserOkButton();

        //Assert.assertTrue(userCreation.hasSuccessMsg(), "User creation was not successful.");

        Assert.assertTrue(userCreation.hasSuccessMsg("Information saved successfully"),
                "User creation was not successful.");

    }

    @Test(priority = 2)
    public void ShowDependentUnauthorizedUserMessage1() {
        // System.out.println("User ID before check: " + userId); // Debug log

        UserManagementPage userCreation = page.getInstance(LoginPage.class)
                .dologin(getUserId(), getPassword())
                .ClickUserManagement1()
                .fillUserID(userId) // Use the userId from the first test
                .clickOutside();

        // Assert that the unauthorized message is displayed
        Assert.assertTrue(userCreation.hasUnauthorizedMsg(), "Expected 'Unauthorized Data Found' message not displayed.");
    }

    @Test(priority = 3)
    public void ShowUnauthorizedUserMessage2() {
        UserManagementPage userCreation = page.getInstance(LoginPage.class)

                .dologin(getUserId(), getPassword())
                .ClickUserManagement1()
                .fillUserID("Tp")
                .clickOutside();
        Assert.assertTrue(userCreation.hasUnauthorizedMsg());//he "New Account" page successfully contains an account ID


    }


    @Test(priority = 4)
    public void UserCreationShouldFailWithoutUsername() {
        // Assign the user ID to the class variable
        userId = "Sei1";

        UserManagementPage userCreation = page.getInstance(LoginPage.class)
                .dologin(getUserId(), getPassword())
                .ClickUserManagement1()
                .fillUserID(userId)
                .clickOutside()
                .SelectHomeOffice("0001")
                .fillDesignation("jhh")
                .SelectHomeCenter(2)
                .fillUserDetails("Test12234667676")
                .fillEmployeeCode("test123")
                .AdministratorRole()
                .SelectMirrorAccount(1)
                .SelectTransactionType(5)
                .fillMakeLimit(999999999999L)
                .fillAuthorizeLimit(999999999999L)
                .fillTransmitLimit(999999999999L)
                .ClickAddLimitOkButton()
                .fillPassWord("11")
                .fillConfirmPassWord("11")
                .SelectUserStatus(1)
                .ClickCreateUserOkButton();


        Assert.assertTrue(userCreation.hasErrorMsg("User Name is required."),
                "not ok.");

    }

}

