package com.jdsport.app.test.home;
import com.jdsport.app.test.home.hook.Hooks;
import com.jdsport.selenium.home.JDSportHomePage;
import com.jdsport.selenium.menu.men.JDSportMenClothingShorts;
import org.junit.Assert;
import org.junit.Test;

public class HomePageTest extends Hooks
{

    private JDSportHomePage homePage;
    private JDSportMenClothingShorts menClothingShorts;

    @Test
    public void hoverOverMensAndSelectShort()
    {
        homePage = new JDSportHomePage();
        homePage.navMenu().MensCategory();
        menClothingShorts = new JDSportMenClothingShorts();
        Assert.assertTrue("Is at men's short page", menClothingShorts.productListBanner().isAt("Men's Shorts"));
    }
}
