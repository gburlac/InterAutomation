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
    @FindBy(xpath = "//input[@id='input-email']")
    private static WebElement enterLoginCredentials;
    @FindBy(xpath = "//input[@id='input-password']")
    private static WebElement enterLoginPswd;
    @FindBy(xpath = "//input[contains(@class, 'btn btn-primary')]")
    private static WebElement pressLoginButon;
    @FindBy(xpath = "//ul[contains(@class, 'nav navbar-nav')]/li[4]/a")
    private static WebElement pressOnCategory;
    @FindBy(xpath = "//div[contains(@class, 'button-group')]/button[1]")
    private static WebElement clickOnAddToCart;
    @FindBy(xpath = "//div[contains(@class, 'alert alert-success alert-dismissible')]/a[2]")
    private static WebElement clickOnGoToCart;


    //method
    public static void clickOnGoToCart() {
        clickOnGoToCart.click();
    }

    public static void clickOnAddToCart() {
        clickOnAddToCart.click();
    }

    public static void pressOnCategory() {
        pressOnCategory.click();
    }

    public static void pressLoginButon() {
        pressLoginButon.click();
    }

    public static void myAccountEnterPswd(String value) {
        enterLoginPswd.sendKeys(value);
    }

    public static void myAccountEnterCr(String value) {
        enterLoginCredentials.sendKeys(value);

    }

    public static void myAccountLogin() {
        myAccountLogin.click();
    }

    public static void myAccountClick() {
        myAccount.click();
    }


}
