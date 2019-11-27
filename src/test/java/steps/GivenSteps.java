package steps;

import cucumber.api.java.en.Given;
import pages.OpenCartPage;

public class GivenSteps {
    @Given("^User is on the OpenCart page$")
    public void iAmOnOpenCartPage() throws Exception {
        OpenCartPage.initialisePage();


    }


}
