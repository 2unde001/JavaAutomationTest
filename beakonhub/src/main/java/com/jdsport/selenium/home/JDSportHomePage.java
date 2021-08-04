package com.jdsport.selenium.home;

import com.jdsport.selenium.driver.JDSportDriver;
import com.jdsport.selenium.menu.men.JDSportMenClothingShorts;
import com.jdsport.selenium.menu.men.JDSportNavMenu;
import com.jdsport.selenium.JDSportVerification;

public class JDSportHomePage
{
    public void open(String url)
    {
        JDSportDriver.open(url);
        JDSportVerification.isCookies();
    }

    public boolean jdSportLogo()
    {
        return JDSportVerification.isLageLogo();

    }

    public JDSportHomePage navMenu()
    {
        return new JDSportHomePage();
    }

    public JDSportMenClothingShorts MensCategory()
    {
        JDSportNavMenu.navigateTo();
        return new JDSportMenClothingShorts();
    }
}
