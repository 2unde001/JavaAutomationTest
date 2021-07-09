package com.jdsport.app.test.home;
import com.jdsport.app.test.home.hook.Hooks;
import com.jdsport.selenium.JDSportHomePage;
import org.junit.Test;

public class HomePageTest extends Hooks
{

    private JDSportHomePage homePage;

    @Test
    public void hoverOverMensAndSelectShort()
    {
        homePage = new JDSportHomePage();
        homePage.navMenu().MensCategory();
    }
}
