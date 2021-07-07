package com.beakonhub.app;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    WebDriver driver;

    /**
     * Set up WebDriverManager launch and manager driver in this instance chromedriver.
     * Navigate to github to verify WebDriver set up
     */
    @Test
    public void driverManagerSetUp() throws InterruptedException {
;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://github.com/");

        // Find element by className
        driver.findElement(By.className("mr-4"));
        assertTrue("Github Logo display", true);
        Thread.sleep(5);


        // Find element by xpath
        WebElement clickMarketPlace = driver.findElement(By.xpath("//a[@href='/marketplace']"));
        clickMarketPlace.click();
        Thread.sleep(3);

        // Find element by cssSelector
        WebElement freeApps = driver.findElement(By.cssSelector("a[class=\"btn-mktg btn-outline-mktg\"]"));
        freeApps.click();
        Thread.sleep(3);

        // Verify free app page is open
        //WebElement appPage = driver.findElement(By.cssSelector("h1[class='h2']"));
        //System.out.print(appPage.getText());

        // Find all elements on this page and print them out
        List<WebElement> caterogiesElement = driver.findElements(By.tagName("li"));
        for (WebElement element : caterogiesElement){
            System.out.print(element.getText() + "\n");
        }

        // Get an element from the list using text method


        List<WebElement> elementByText = driver.findElements(By.tagName("li"));
        for (WebElement element : elementByText){
            if(element.getText().contains("API management")){

                element.click();
                break;
            }
        }

        // Validate click on the individual element under category is highlighted
        WebElement highlight = driver.findElement(By.cssSelector("a[class='filter-item d-flex flex-justify-between flex-items-center py-2 mb-0 selected']"));
        assertTrue("API management is enable", highlight.isEnabled());

        // Get element by index from the list

        //List<WebElement> elementByIndex = driver.findElements(By.tagName("li"));
        //System.out.print(elementByIndex.get(3));







        driver.close();

    }





}
