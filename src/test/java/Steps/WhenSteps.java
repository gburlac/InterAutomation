package Steps;

import Pages.OpenCartPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class WhenSteps {
    @When("^Login on OpenCart$")
    public void iLoginOnOpenCarts(DataTable dt) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        List<String> value = dt.asList(String.class);
        OpenCartPage.myAccountClick();
        OpenCartPage.myAccountLogin();
        OpenCartPage.myAccountEnterCr(value.get(0));
        OpenCartPage.myAccountEnterPswd(value.get(1));
        OpenCartPage.pressLoginButon();


    }

    @And("^Add product to cart$")
    public void addProductToCart() throws Exception {
        OpenCartPage.pressOnCategory();
        OpenCartPage.clickOnAddToCart();
        OpenCartPage.clickOnGoToCart();

    }

    @When("^Remove from cart$")
    public void removeFromCart() throws Exception {

        OpenCartPage.clickRemoveFromCart();
//        Thread.sleep(3000);

    }


}
