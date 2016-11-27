package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by DELL on 11/12/2016.
 */
public class Drivers {

    public static WebDriver getDriver() {
        WebDriver driver = null;
        String nameDriver = System.getProperty("driver");
        if (nameDriver != null) {
            switch (nameDriver) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                case "fireFox":
                    System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
                    driver = new InternetExplorerDriver();
                    break;
                case "edge":
                    System.setProperty("webdriver.edge.driver", "drivers\\MicrosoftWebDriver.exe");
                    driver = new EdgeDriver();
                    break;

            }
        } else {

            System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        return driver;
    }


}
