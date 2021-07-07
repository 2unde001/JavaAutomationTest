package com.jdsport.selenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDSportDriver
{
    private static WebDriver driver;

    public static void initDriver()
    {
        WebDriverManager.chromedriver().setup();
    }

    public static void driverSetUp()
    {
        driver = new ChromeDriver();
    }

    public static void close()
    {
        driver.close();
    }

    public static void open(String url)
    {
        driver.navigate().to(url);
    }
}
