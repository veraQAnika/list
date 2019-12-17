package PerformanceTest;

import TestHelpers.BasePerformanceTest;
import TestHelpers.BaseTest;
import helpers.MainHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.util.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.WebPerformancePage;

import java.util.List;
import static TestHelpers.HelpMethods.*;

public class LandingPagePerformanceTest extends BasePerformanceTest {
    private static WebPerformancePage webPerformancePage;
    private static String theListUrl;

    @BeforeClass
    public void setUp() {
        webPerformancePage = PageFactory.initElements(driver, WebPerformancePage.class);
        wait.until(ExpectedConditions.elementToBeClickable(webPerformancePage.startTest));
        theListUrl = MainHelpers.PROTOCOL +
                "://" +
                MainHelpers.getURL();
    }

    @AfterMethod
    public void tearDown() {

    }

    @Test
    public void landingPagePerformanceTest() {
        webPerformancePage.webSiteUrl.sendKeys(theListUrl);
        webPerformancePage.startTest.click();
//        clickElement(webPerformancePage.startTest);
//        clickElement("input#location-ok");
        performanceWait.until(ExpectedConditions.visibilityOfAllElements(webPerformancePage.avarageResul));
        List<WebElement> aGrades = performanceGrades("A");
        List<WebElement> bGrades = performanceGrades("B");
        List<WebElement> cGrades = performanceGrades("C");
        List<WebElement> dGrades = performanceGrades("D");
        List<WebElement> eGrades = performanceGrades("E");
        List<WebElement> fGrades = performanceGrades("F");
        Assert.notEmpty(aGrades);

    }
}
