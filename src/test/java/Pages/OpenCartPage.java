package Pages;

import Util.Driver;
import org.openqa.selenium.support.PageFactory;

public class OpenCartPage {
    //initializing
    private static final String URL = "https://demo.opencart.com/";

    public static  void initialisePage(){
        Driver.getDriver().get(URL);
        PageFactory.initElements(Driver.getDriver(),OpenCartPage.class);
    }

    //find elements


}
