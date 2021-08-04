package com.jdsport.selenium.driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class JDSportDriver
{
    public static WebDriver driver;

    public static void initDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void close()
    {
        driver.close();
    }

    public static void open(String url)
    {
        driver.navigate().to(url);
        driver.findElement(By.cssSelector("button[class='btn btn-level1 accept-all-cookies']")).click();

    }

    public static void hoveOverElement(WebElement menCategory) {
        Actions actions = new Actions(JDSportDriver.driver);
        actions.moveToElement(menCategory).perform();
    }


    public static void hoveOverElementAndClick(WebElement clickSubMenu)
    {
        Actions actions = new Actions(JDSportDriver.driver);
        actions.moveToElement(clickSubMenu).click().build().perform();
    }
}
