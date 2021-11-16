package weBuyAnyCarHome;

import carData.VehicleNumbersData;
import driverManager.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.FileNotFoundException;
import java.util.List;

public class SearchForVehicle
{
    private static final int WAIT_TIME = 10;
    private static final String ELEMENT_LOCATOR = "vrm-input";
    private String plateNumber;
    private String dbPlateNumbers;
    private VehicleNumbersData vehicleNumbersData;

    private final WebDriver driver;


    public SearchForVehicle()
    {
        this.driver = BrowserManager.driver;
    }


    public SearchForVehicle withPlateNumber(String plateNumber)
    {
        this.plateNumber = plateNumber;
        return this;
    }

    public SearchForVehicle matchDataBase(String dbPlateNumbers)
    {
        this.dbPlateNumbers = dbPlateNumbers;
        return this;
    }

    public void checkVehicleHistory() throws FileNotFoundException
    {
        extractPlateNumberFromTheFile(dbPlateNumbers,plateNumber);
        driver.findElement(By.className("jsx-634808616")).click();
        checkVehicle();

    }

    private void checkVehicle()
    {
        BrowserManager.waitForElementVisibility(WAIT_TIME,ELEMENT_LOCATOR);
        driver.findElement(By.className("jsx-1164392954")).click();
    }

    private void extractPlateNumberFromTheFile(String matchPlateNumber, String readFileData) throws FileNotFoundException
    {
        vehicleNumbersData = new VehicleNumbersData();
        String dataToSend = vehicleNumbersData.enterVehiclePlateNumber(matchPlateNumber,readFileData);
        driver.findElement(By.id("vrm-input")).sendKeys(dataToSend);

    }

    public String isDisplayedVehicleDetails(String reg) throws FileNotFoundException, InterruptedException {

        Thread.sleep(10);

        List<WebElement> orderSummary = driver.findElements(By.className("jsx-1162687698"));

        for (WebElement vehicleDetail:orderSummary)
        {
            String allText = vehicleDetail.getText();
            if (allText != null){
                vehicleNumbersData = new VehicleNumbersData();
                vehicleNumbersData.enterVehiclePlateNumber(allText, reg);

                System.out.println(reg);
                break;
            }
        }
        return reg;
    }
}
