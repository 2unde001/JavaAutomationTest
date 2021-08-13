package com.jdsport.selenium.productListing.productListElements;

import com.jdsport.selenium.driver.JDSportDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class JDSportProductsListElements extends JDSportDriver
{
    public static void selectMensShort()
    {
        List<WebElement> shortWear =  driver.findElements(By.className("productListItem"));
        shortWear.get(1).click();

    }
}
