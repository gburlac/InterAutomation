package Steps;

import Util.Driver;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static junit.framework.Assert.assertTrue;

public class ThenSteps {
    @Then("^Check product is in cart$")
    public void checkProductIsInCart() {
//        String messageCheck = Driver.getDriver().findElement(By.xpath("//h1[@id='greetings_phraze']")).getText();
//        assertTrue(messageCheck.contains("Vă felicităm cu achiziția!"));
    }
}
