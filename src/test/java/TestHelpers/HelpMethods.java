package TestHelpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HelpMethods extends BaseTest {

    public static void clickElement(WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public static void hoverElement(WebElement element){
        String strJavaScript = "var element = arguments[0]; var mouseEventObj = document.createEvent('MouseEvents'); mouseEventObj.initEvent( 'mouseover', true, true ); element.dispatchEvent(mouseEventObj);";
        ((JavascriptExecutor) driver).executeScript(strJavaScript, element);
    }

    public static int getRandom(int max){
        // return (int) (Math.random()*max);  //incorrect always return zero
        return (int) (Math.random()*max);
    }

    public static Boolean elementExistByCSS(String selector){
        return driver.findElements(By.cssSelector(selector)).size() != 0;
    }

    public static void scrollToElement(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
