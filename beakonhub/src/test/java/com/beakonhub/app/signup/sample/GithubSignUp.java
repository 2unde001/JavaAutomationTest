package com.beakonhub.app;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class GithubSignUp
{
    WebDriver driver;

    public void signupTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.navigate().to("https://github.com/");

        // Find element by className
        driver.findElement(By.className("mr-4"));
        assertTrue("Github Logo display", true);

        /*
        Click signup button to create a github account
         */
        WebElement signupButton = driver.findElement(By.cssSelector("a[href=\"/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home\"]"));
        signupButton.click();

        // Wait for signup page to display
        WebElement signupSnippet = driver.findElement(By.cssSelector("span[class='sr-only']"));
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.textToBePresentInElement(signupSnippet,"e.g. monalisa@github.com"));

        // Enter signup email
        WebElement signup = driver.findElement(By.cssSelector("a[href=\'/login\']"));
        signup.sendKeys("signuptest@gmail.com");

        /*Click continue button. There are 7 continue button elements as at the time of this test
        * Loop through all the button elements and click button that contains "Continue"
        * */

        String btnList;
        List<WebElement> continueButtonList = driver.findElements(By.cssSelector("button[type='button']"));
        for (WebElement elementToClick:continueButtonList)
        {
            if (elementToClick.getText().contains("Continue")){
                elementToClick.click();
                break;
            }
        }






    }
}
