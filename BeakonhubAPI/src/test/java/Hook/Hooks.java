package Hook;

import base.BaseURL;
import org.testng.annotations.BeforeTest;

public class Hooks
{
    @BeforeTest
    public void beforeTest()
    {

        BaseURL.URI();
    }
}
