package com.jdsport.app.test.home;
import com.jdsport.app.test.home.hook.Hooks;
import com.jdsport.selenium.home.JDSportHomePage;
import com.jdsport.selenium.productListing.mensShorts.JDSportMenShortsListingPage;
import org.junit.Assert;
import org.junit.Test;

public class HomePageTest extends Hooks
{

    private JDSportHomePage homePage;
    private JDSportMenShortsListingPage menClothingShorts;

    @Test
    public void hoverOverMensAndSelectShort()
    {
        homePage = new JDSportHomePage();
        homePage.navMenu().MensCategory();

        menClothingShorts = new JDSportMenShortsListingPage();

        Assert.assertTrue("Is at men's short page", menClothingShorts.productListBanner().isAt("Men's Shorts"));
    }


}
