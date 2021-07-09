package com.jdsport.selenium;

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

    public void MensCategory()
    {
        JDSportNavMenu.navigateTo();
    }
}
