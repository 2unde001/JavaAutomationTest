package com.beakonhub.app;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DomWait
{

    @Test
    public void domImplicitWait(){

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.navigate().to("https://github.com/");
        WebElement mktPlace = driver.findElement(By.cssSelector("a[href=\"/marketplace\"]"));
        mktPlace.click();

        /* Verify "Type" is display on the Marketplace page */
        WebElement innerTextType = driver.findElement(By.cssSelector("h4[class=\"text-mono mb-3 text-normal\"]"));
        Assert.assertEquals("Market place page contain Types","Types",innerTextType.getText());

        /*
        Using explicit wait
        */


        // Use  explicit wait instead of thread.sleep
        WebElement freeApps = driver.findElement(By.cssSelector("a[class=\"btn-mktg btn-outline-mktg\"]"));
        freeApps.click();

        // Locate "Free" element on the free page
        WebElement appPage = driver.findElement(By.cssSelector("h1[class='h2']"));


        // Wait for 10 seconds for "Free" to be present
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBePresentInElement(appPage, "Free"));
        System.out.print(appPage.getText());

    }



}
