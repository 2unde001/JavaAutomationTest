package com.jdsport.selenium.home;
import com.jdsport.selenium.productListing.mensShorts.JDSportMenShortsListingPage;
import com.jdsport.selenium.menu.men.JDSportNavMenu;

public class JDSportHomePage
{

    public JDSportHomePage navMenu()
    {
        return new JDSportHomePage();
    }

    public JDSportMenShortsListingPage MensCategory()
    {
        JDSportNavMenu.clickNavMenu();
        return new JDSportMenShortsListingPage();
    }
}
