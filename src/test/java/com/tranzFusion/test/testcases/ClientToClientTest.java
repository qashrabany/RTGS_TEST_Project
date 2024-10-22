package com.tranzFusion.test.testcases;

import com.tranzFusion.test.pages.ClientToClient;
import com.tranzFusion.test.pages.LoginPage;
import org.testng.annotations.Test;

public class ClientToClientTest extends BaseTest{
    @Test
    public void ClientToClientTransactionShouldSucceed(){
        ClientToClient clientToClient=page.getInstance(LoginPage.class)
                .dologin(getUserId(),getPassword())
                .clicktoClientbtn()
                .selectMirrorAccount()
                .selectTransactionType()
                .selectPriority()
                .selectCustomerOffice()
                .fillCustomerAccountNo()
                .selectCountry()
                .selectCity()
                .insertAmount()
                .insertAgentInstructions()
                .insertParticulars()
                .selectBank()
                .selectMirrorAccount2()
                .selectOffice()
                .insertCustomerAccountNo()
                .insertCustomerAccountName()
                .insertCustomerAddressLine()
                .selectCountry2()
                .selectCity2()
                .clickOkBtn();
    }
}
