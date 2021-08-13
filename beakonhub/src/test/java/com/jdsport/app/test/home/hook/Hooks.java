package com.jdsport.app.test.home.hook;
import com.jdsport.selenium.driver.JDSportDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import static com.jdsport.selenium.Utilities.JD_SPORT_URL;


public class Hooks
{
    @BeforeClass
    public static void setUp()
    {
        JDSportDriver.initDriver();
    }

    @Before
    public void setDriver()
    {
        JDSportDriver.open(JD_SPORT_URL);

    }

    @After
    public void closeBrowser(){
        JDSportDriver.close();
    }


}
