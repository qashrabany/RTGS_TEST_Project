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
                .selectMirrorAccount(1)
                .selectTransactionType(1)
                .selectPriority(1)
                .selectCustomerOffice(1)
                .fillCustomerAccountNo("1111")
                .selectCountry(1)
                .selectCity(1)
                .insertAmount(100001)
                .insertAgentInstructions("ASDF")
                .insertParticulars("ASDDF")
                .selectBank(1)
                .selectMirrorAccount2(1)
                .selectOffice(1)
                .insertCustomerAccountNo("1111")
                .insertCustomerAddressLine("Mirpur")
                .selectCountry2(1)
                .selectCity2(1)
                .clickOkBtn();
    }
}
