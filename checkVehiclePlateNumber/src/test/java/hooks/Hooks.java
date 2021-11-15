package hooks;

import driverManager.BrowserManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class Hooks
{
    @BeforeEach
    public void setUpDriver() throws InterruptedException
    {
        BrowserManager.launchBrowser();

    }

    @AfterEach
    public void close()
    {
        BrowserManager.close();
    }



}
