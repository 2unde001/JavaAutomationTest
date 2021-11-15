package vehicleDetails;

import driverManager.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VehicleDetails
{
    WebDriver driver;

    public VehicleDetails()
    {
        this.driver = BrowserManager.driver;
    }

    public boolean getPlateNumber(String plateNumber) throws InterruptedException
    {
        Thread.sleep(5);
        List<WebElement> elements = driver.findElements(By.cssSelector(".details-vrm.ng-star-inserted"));
        for (WebElement element:elements)
        {
            element.getText().contains(plateNumber);
        }
        return true;
    }


    public void valueMyCar()
    {
    }


}
