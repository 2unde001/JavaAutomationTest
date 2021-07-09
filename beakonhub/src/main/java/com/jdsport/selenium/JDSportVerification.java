package com.jdsport.selenium;
import com.jdsport.selenium.homePageElements.JDSportHomePageElements;

public class JDSportVerification
{


    public static boolean isLageLogo()
    {
        return JDSportHomePageElements.isJdSportLargeLogo();
    }

    public static void isCookies()
    {
        JDSportHomePageElements.acceptCookies();
    }
}
