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

        Assertions.assertEquals(search.getOrderSummary("SG18HTN", "Volkswagen,Golf Se Navigation Tsi Evo"), search.compareToDataBase());
        Assertions.assertEquals(search.getOrderSummary("2018", "White"), search.compareToDataBase());
        

    }

}
