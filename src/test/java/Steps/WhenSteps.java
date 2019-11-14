package Steps;

import Pages.OpenCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class WhenSteps {
    @When("^Login on OpenCart$")
    public void iLoginOnOpenCarts() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OpenCartPage.myAccountClick();
        OpenCartPage.myAccountLogin();


    }

    @And("^Add product to cart$")
    public void addProductToCart() {


    }
}
