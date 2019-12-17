package TestHelpers;

import helpers.MainHelpers;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.reporters.jq.Main;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static WebDriverWait longWait;
    public static WebDriverWait performanceWait;

    private static long waitTime = 20;
    private static long longWaitTime = 40;
    private static long performanceWaitTime = 120;

    @BeforeTest
    public static void beforeTest() throws Exception {
        MainHelpers.InitialSetUp();
    }

    @BeforeClass(alwaysRun = true)
    public void startDriver() throws MalformedURLException {
        if (!MainHelpers.isMobile &&  MainHelpers.browser.equals(MainHelpers.chromeBr)) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.addArguments("--start-fullscreen"); //--kiosk no header

            driver = new ChromeDriver(options);

        } else if (!MainHelpers.isMobile && MainHelpers.browser.equals(MainHelpers.safariBr)) {
            driver = new SafariDriver();
            driver.manage().window().maximize();

        }else if (MainHelpers.isMobile){
            URL url = new URL("http://0.0.0.0:4723/wd/hub");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.4");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
            capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");

            driver = new IOSDriver<IOSElement>(url, capabilities);

        }
        driver.get(
                MainHelpers.PROTOCOL +
                        "://" +
                        MainHelpers.getURL()
        );

        longWait = new WebDriverWait(driver, longWaitTime);
        wait = new WebDriverWait(driver, waitTime);
        performanceWait = new WebDriverWait(driver, performanceWaitTime);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.action.allow.primary")));
        WebElement cookyBtn = driver.findElement(By.cssSelector("button.action.allow.primary"));
        HelpMethods.clickElement(cookyBtn);
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
