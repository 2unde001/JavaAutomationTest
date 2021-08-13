package com.jdsport.selenium.homePageElements;
import com.jdsport.selenium.driver.JDSportDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JDSportHomePageElements extends JDSportDriver
{

    public static boolean isJdSportLargeLogo()
    {
        return driver.findElement(By.
                className("logo-large")).isDisplayed();
    }

    public static void acceptCookies()
    {
        driver.findElement(By.cssSelector("button[class='btn btn-level1 accept-all-cookies']"))
                .click();
    }

    public static void hoverOverMenCategory()
    {
        WebElement menCategory = driver.findElement(By.cssSelector("a[href='/page/mens/']"));
        hoveOverElement(menCategory);

        WebElement menCategoryShorts = driver.findElement(By.cssSelector("a[href=\"/men/mens-clothing/shorts/\"]"));
        menCategoryShorts.click();


       // hoveOverElementAndClick((menCategoryShorts));

    }


}
