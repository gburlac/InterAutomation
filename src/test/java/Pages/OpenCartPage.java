package Pages;

import Util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;

import static junit.framework.Assert.assertTrue;

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
    @FindBy(xpath = "//li[4]/a/span[contains(@class, 'hidden-xs hidden-sm hidden-md')]")
    private static WebElement clickOnGoToCart;
    @FindBy(xpath = "//span/button[contains(@class, 'btn btn-danger')]")
    private static WebElement clickRemoveFromCart;
    @FindBy(xpath = "//a[contains(@class, 'btn btn-primary')]")
    private static WebElement checkCartIsEmpty;
    @FindBy(xpath = "//li[7]/a")
    private static WebElement clickOnCategory2;
    @FindBy(xpath = "//div[contains(@class, 'product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12')][2]/div[contains(@class, 'product-thumb')]/div[2]/div[contains(@class," +
            " 'button-group')]/button[1]/span[contains(@class, 'hidden-xs hidden-sm hidden-md')]")
    private static WebElement clickOnAddToCart2Products;
    @FindBy(xpath = "//form/.//table/.//tr")
    private static WebElement tableRows;


    //method
//    public static void getTableCells(){
////        List<HashMap<String, String>>
//        List<WebElement> rows = (List<WebElement>) tableRows;
//        rows.stream().forEach(it -> it.findElement("/td"));
//    }

    public static void clickOnAddToCart2Products() {
        clickOnAddToCart2Products.click();
    }

    public static void clickOnCategory2() {
        clickOnCategory2.click();
    }

    public static void checkCartIsEmpty() {
        assertTrue(checkCartIsEmpty.isDisplayed());
//        assertTrue(checkCartIsEmpty.isEnabled());
    }

    public static void clickRemoveFromCart() {
        clickRemoveFromCart.click();
    }

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
