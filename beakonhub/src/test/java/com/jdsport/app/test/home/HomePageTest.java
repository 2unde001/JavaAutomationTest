package com.jdsport.app.test.home;
import com.jdsport.app.test.home.hook.Hooks;
import com.jdsport.selenium.JDSportHomePage;
import org.junit.Test;

public class HomePageTest extends Hooks
{
    @Test
    public void homePageTest()
    {
        JDSportHomePage.open("https://www.jdsports.co.uk/");
    }
}
