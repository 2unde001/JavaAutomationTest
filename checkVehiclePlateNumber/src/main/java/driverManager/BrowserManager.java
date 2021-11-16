package driverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

    public static void navigateToWeBuyAnyCar()
    {
        driver.get(CAR_TAX_URL);
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


}
