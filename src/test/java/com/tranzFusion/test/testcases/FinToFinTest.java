package com.tranzFusion.test.testcases;

import com.tranzFusion.test.pages.FinToFin;
import com.tranzFusion.test.pages.HomePage;
import com.tranzFusion.test.pages.LoginPage;
import org.testng.annotations.Test;

public class FinToFinTest extends BaseTest{
    @Test
    public void FinToFinTransactionShouldBeSucceed(){
        FinToFin finToFin = page.getInstance(LoginPage.class).
                dologin(getUserId(),getPassword())
                .clicktoFinbtn()
               .selectMirrorAccount(1)
                .selectTransactionType(1)
                .selectPriority(1)
                .insertAmount(400000)
                .insertAgentInstructions("fdg dgd")
                .insertParticulars("fdf")
                .selectReceiverBank(3)
                .selectReceiverMirrorAccount(1)
                .clickOkBtn();


    }
}
