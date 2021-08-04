package com.jdsport.selenium.category.men.shorts;

import com.jdsport.selenium.driver.JDSportDriver;
import org.openqa.selenium.By;

public class JDSportMenClothingPageElements
{
    public static void isDisplayed(String title)
    {
        JDSportDriver.driver.findElement(By.className("fhTitle"))
                .getText().contains(title);
    }
}
