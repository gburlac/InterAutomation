package Steps;

import Pages.OpenCartPage;
import Util.Driver;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class ThenSteps {
    @Then("^Check product is in cart$")
    public void checkProductIsInCart() {
        String messageCheck = Driver.getDriver().findElement(By.xpath("//table[contains(@class, 'table table-bordered')]/tbody/tr/td[contains(@class, 'text-left')][1]/a")).getText();
        assertTrue(messageCheck.contains("Samsung Galaxy"));
    }

    @Then("^Verify cart is empty$")
    public void verifyCartIsEmpty()throws Exception {
        OpenCartPage.checkCartIsEmpty();
//        Thread.sleep(4000);


    }


}
