import TestHelpers.BaseTest;
import TestHelpers.HelpMethods;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class sampleTest extends BaseTest {
    @Test
    public void registrationTest() throws MalformedURLException, InterruptedException {
//        Thread.sleep(10000);
        WebElement account = driver.findElement(By.id("authorization-trigger"));
//        Actions action = new Actions(driver);
//        action.clickAndHold(account).moveToElement(account).perform();

        String strJavaScript = "var element = arguments[0]; var mouseEventObj = document.createEvent('MouseEvents'); mouseEventObj.initEvent( 'mouseover', true, true ); element.dispatchEvent(mouseEventObj);";
        ((JavascriptExecutor) driver).executeScript(strJavaScript, account);
        WebElement register = driver.findElement(By.cssSelector("a.creat-account-box"));
        HelpMethods.clickElement(register);
        WebDriverWait wait = new WebDriverWait(driver, 20);
//        WebElement emailAdr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
//        WebElement emailAdr = driver.findElement(By.id("email"));
//        emailAdr.sendKeys("veronika.baklacheva@gmail.com");
//        WebElement pass = driver.findElement(By.id("pass"));
//        pass.sendKeys("kukumumu");
//        WebElement loginBtn = driver.findElement(By.id("send2"));
//        loginBtn.click();
        WebElement firstName = wait.until(ExpectedConditions.elementToBeClickable(By.id("firstnameispbxi_")));
        firstName.sendKeys("Test");
        WebElement secondName = driver.findElement(By.id("lastnameispbxi_"));
        secondName.sendKeys("Automation");
        Thread.sleep(1000);
        String timestamp = String.valueOf( System.currentTimeMillis());
        String emailVal = "test.gothelist+"+timestamp+"@gmail.com";
        WebElement email = driver.findElement(By.cssSelector("input#email_address.input-text.register_email_address"));
        email.sendKeys(emailVal);
//        JavascriptExecutor jexe = (JavascriptExecutor) driver;
////        jexe.executeScript("document.getElementById('email_address').value='Avinash Mishra';");
//        jexe.executeScript("arguments[0].value='kuku@k.com';", email.findElements(By.xpath("..")));

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("kukumumu");
        WebElement confirmPsw = driver.findElement(By.id("password-confirmation"));
        confirmPsw.sendKeys("kukumumu");
        WebElement accept = driver.findElement(By.cssSelector("input#terms.checkbox"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", accept);
//        new Actions(driver).moveToElement(accept).click().perform();
//        accept.click();
        WebElement registerBtn = driver.findElement(By.cssSelector("button.action.submit.primary"));
        executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", registerBtn);
//        new Actions(driver).moveToElement(registerBtn).click().perform();
//        registerBtn.click();
        Thread.sleep(10000);
    }

    @Test
    public void addToBag() throws InterruptedException {
        WebElement bag = longWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Bags']")));
        bag.click();
        List<WebElement> bags = driver.findElements(By.xpath("//li[@class='isp_grid_product quick']"));
        bags.get(0).click();
        WebElement addToBag = wait.until(ExpectedConditions.elementToBeClickable(By.id("product-addtocart-button")));
        addToBag.click();
        WebElement goToCheckOut = longWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='custom-checkout action primary checkout']")));
        goToCheckOut.click();
        WebElement proceed = longWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='shipping-continue-button']")));
        WebElement email = driver.findElement(By.id("customer-email"));
        String timestamp = String.valueOf( System.currentTimeMillis());
        String emailVal = "test.gothelist+"+timestamp+"@gmail.com";
        email.sendKeys(emailVal);
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        JavascriptExecutor jexe = (JavascriptExecutor) driver;
////        jexe.executeScript("document.getElementById('email_address').value='Avinash Mishra';");
        jexe.executeScript("arguments[0].value='kuku';",firstName);
//
//        firstName.sendKeys("Test");

        Thread.sleep(5000);
    }

}