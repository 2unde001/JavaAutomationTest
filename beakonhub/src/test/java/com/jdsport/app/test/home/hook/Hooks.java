package com.jdsport.app.test.home.hook;
import com.jdsport.selenium.JDSportDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

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
        JDSportDriver.driverSetUp();

    }

    @After
    public void closeBrowser(){
        JDSportDriver.close();
    }
}
