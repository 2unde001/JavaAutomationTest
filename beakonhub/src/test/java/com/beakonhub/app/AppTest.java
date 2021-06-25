package com.beakonhub.app;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
        WebElement appPage = driver.findElement(By.cssSelector("h1[class='h2']"));
        System.out.print(appPage.getText());



        driver.close();

    }





}
