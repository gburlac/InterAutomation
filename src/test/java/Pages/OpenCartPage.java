package Pages;

import Util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenCartPage {
    //initializing
    private static final String URL = "https://demo.opencart.com/";

    public static void initialisePage() {
        Driver.getDriver().get(URL);
        PageFactory.initElements(Driver.getDriver(), OpenCartPage.class);
    }

    //find elements
    @FindBy(xpath = "//a[contains(@class, 'dropdown-toggle')]/span[contains(@class, 'hidden-xs hidden-sm hidden-md')]")
    private static WebElement myAccount;
    @FindBy(xpath = "//ul[contains(@class, 'dropdown-menu dropdown-menu-right')]/li[2]/a")
    private static WebElement myAccountLogin;

    //method
    public static void myAccountLogin() {
        myAccountLogin.click();
    }public static void myAccountClick() {
        myAccount.click();
    }


}
