import driverManager.BrowserManager;
import hooks.Hooks;
import org.junit.jupiter.api.Test;
import weBuyAnyCarHome.SearchForVehicle;
import org.junit.jupiter.api.Assertions;
import java.io.FileNotFoundException;

public class CheckCarValueTest extends Hooks
{

    @Test
    public void navigateToWeBuyAnyCar() throws InterruptedException, FileNotFoundException {
        BrowserManager.navigateToWeBuyAnyCar();
        SearchForVehicle search = new SearchForVehicle();

        search.matchDataBase("KT17DLX,DN09HRM,SG18HTN").withPlateNumber("SG18HTN").checkVehicleHistory();

        Assertions.assertEquals(search.isDisplayedVehicleDetails("SG18HTN"), "SG18HTN");
        Assertions.assertEquals(search.isDisplayedVehicleDetails("Volkswagen"), "Volkswagen");
        Assertions.assertEquals(search.isDisplayedVehicleDetails("White"), "White");
        Assertions.assertEquals(search.isDisplayedVehicleDetails("2018"), "2018");

    }

}
