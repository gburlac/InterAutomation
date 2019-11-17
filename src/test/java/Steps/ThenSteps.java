package Steps;

import Util.Driver;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static junit.framework.Assert.assertTrue;

public class ThenSteps {
    @Then("^Check product is in cart$")
    public void checkProductIsInCart() {
        String messageCheck = Driver.getDriver().findElement(By.xpath("//table[contains(@class, 'table table-bordered')]/tbody/tr/td[contains(@class, 'text-left')][1]/a")).getText();
        assertTrue(messageCheck.contains("Samsung Galaxy Tab 10.1"));
    }
}
