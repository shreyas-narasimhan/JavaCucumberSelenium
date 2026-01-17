package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepDefinition.Login;
import static utility.BrowserDriver.driver;

public class Hooks {

    public static BrowserDriver browserDriver;

    @Before
    public void setUp() throws Throwable {
        browserDriver = new BrowserDriver();
        //driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        if (browserDriver != null) {
            browserDriver.close();
        }
    }
}
