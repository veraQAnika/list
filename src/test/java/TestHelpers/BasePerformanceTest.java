package TestHelpers;

import helpers.MainHelpers;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.reporters.jq.Main;

import java.net.MalformedURLException;
import java.net.URL;

public class BasePerformanceTest {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static WebDriverWait longWait;
    public static WebDriverWait performanceWait;

    private static long waitTime = 20;
    private static long longWaitTime = 40;
    private static long performanceWaitTime = 120;
    private static String webPerformanceURL =  "https://www.webpagetest.org";

    @BeforeTest
    public static void beforeTest() throws Exception {
        MainHelpers.InitialSetUp();
    }

    @BeforeClass(alwaysRun = true)
    public void startDriver() throws MalformedURLException {
        MainHelpers.setCorrectDriverInfo(MainHelpers.chromeBr);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--start-fullscreen"); //--kiosk no header

        driver = new ChromeDriver(options);
        driver.get(webPerformanceURL);

        longWait = new WebDriverWait(driver, longWaitTime);
        wait = new WebDriverWait(driver, waitTime);
        performanceWait = new WebDriverWait(driver, performanceWaitTime);
    }


    @AfterTest(alwaysRun = true)
    public static void afterTest() {
        if(!driver.toString().contains("(null)")) {
            driver.quit();
        }
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        driver.quit();
    }

}
