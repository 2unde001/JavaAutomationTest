package com.jdsport.selenium;
import com.jdsport.selenium.category.men.shorts.JDSportMenClothingPageElements;
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

    public static void menShortCategory(String title)
    {
        JDSportMenClothingPageElements.isDisplayed(title);
    }
}
