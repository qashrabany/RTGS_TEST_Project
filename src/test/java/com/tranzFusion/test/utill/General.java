package com.tranzFusion.test.utill;

public class General {

    public static final int WAIT_TIME=60;
    public static final String LOGIN_TITLE = "User Management - TranzFusion";

    public static void waitForSeeText()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}