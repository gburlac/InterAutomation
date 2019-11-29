package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.jupiter.api.BeforeAll;
import util.Driver;

public class BeforeAfterSteps {
    @Before
    public void before() {
        Driver.startDriver();
    }


    @After
    public void after() throws Exception {
        Thread.sleep(5000);
        Driver.getDriver().quit();
    }
}
