package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver driver;

    public static WebDriver createDriver() {
        if (driver == null)
            driver = new ChromeDriver();
        return driver;
    }

    public static void startDriver() {

//        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();
//        WebDriverManager.edgedriver().setup();
//        driver = new EdgeDriver();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        WebDriverManager.operadriver().setup();
//        driver = new OperaDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }

    public static WebDriver getDriver() {
        return driver;
    }
}
