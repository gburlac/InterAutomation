package Steps;

import Pages.OpenCartPage;
import cucumber.api.java.en.Given;

public class GivenSteps {
    @Given("^I am on the OpenCart page$")
    public void iAmOnOpenCartPage()throws Exception{
        OpenCartPage.initialisePage();


    }


}
