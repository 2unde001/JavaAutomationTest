package driverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BrowserManager
{
    private static final String CAR_TAX_URL = "https://cartaxcheck.co.uk/" ;
    public static WebDriver driver;

    public static void launchBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void navigateToWeBuyAnyCar() throws InterruptedException {
        driver.get(CAR_TAX_URL);
        //isCookies();
    }

    private static void isCookies()
    {
        driver.findElement(By.cssSelector("button[id*='accept']")).click();

    }

    public static void waitForElementVisibility(int waitTime, String elementLocator)
    {
        new WebDriverWait(driver, Duration.ofSeconds(waitTime))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id(elementLocator)));
    }


    public static void close()
    {
        driver.quit();
    }

    public static void pageContains(int waitTime, String pageTitle)
    {
        new WebDriverWait(driver,Duration.ofSeconds(waitTime))
                .until(ExpectedConditions.titleIs(pageTitle));
    }
}
