package hooks;

import driverManager.BrowserManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class Hooks
{
    @BeforeEach
    public void setUpDriver()
    {
        BrowserManager.launchBrowser();
    }

    @AfterEach
    public void close()
    {
        BrowserManager.close();
    }



}
