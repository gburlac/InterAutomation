package steps;

import cucumber.api.java.en.Then;
import pages.OpenCartPage;
import util.Driver;

import java.util.concurrent.TimeUnit;

public class ThenSteps {
    @Then("^Check product is in cart$")
    public void checkProductIsInCart() {
        OpenCartPage.checkCartIsProduct();
//        String messageCheck = Driver.getDriver().findElement(By.xpath("//table[contains(@class, 'table table-bordered')]/tbody/tr/td[contains(@class, 'text-left')][1]/a")).getText();
//        assertTrue(messageCheck.contains("Samsung Galaxy"));
    }

    @Then("^Verify cart is empty$")
    public void verifyCartIsEmpty() throws Exception {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(1000);
        OpenCartPage.checkCartIsEmpty();


    }


}
