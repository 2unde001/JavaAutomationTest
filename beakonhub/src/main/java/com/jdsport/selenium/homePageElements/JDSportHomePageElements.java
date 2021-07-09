package com.jdsport.selenium.homePageElements;
import com.jdsport.selenium.JDSportDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JDSportHomePageElements
{
    public static boolean isJdSportLargeLogo()
    {
        return JDSportDriver.driver.findElement(By.
                className("logo-large")).isDisplayed();
    }

    public static void acceptCookies()
    {
        JDSportDriver.driver.
                findElement(By.cssSelector("button[class='btn btn-level1 accept-all-cookies']"))
                .click();
    }

    public static void hoverOverMenCategory()
    {
        WebElement menCategory = JDSportDriver.driver.findElement(By.cssSelector("a[href='/page/mens/']"));
        WebElement menCategoryShorts = JDSportDriver.driver.findElement(By.cssSelector("a[href='/men/mens-clothing/shorts/']"));

        JDSportDriver.hoveOverElement(menCategory);
        JDSportDriver.hoveOverElementAndClick((menCategoryShorts));

    }


}
