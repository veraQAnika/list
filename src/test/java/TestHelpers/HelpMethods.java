package TestHelpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.ItemDetailsPage;
import java.util.List;

public class HelpMethods extends BaseTest {

    public static void clickElement(String elCSS){
        WebElement element = longWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(elCSS))));
//        WebElement element = driver.findElement(By.cssSelector(elCSS));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

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

    public static void openDetailsPage(WebElement itemImage, String productID){
        try{
            wait.until(ExpectedConditions.visibilityOf(itemImage));}
        catch (Exception ex){
            if(elementExistByCSS(ItemDetailsPage.pnfCSS)){
                Assert.fail( "ProductID with Page Not Found while opening details page is - " + productID);
            }
            else{
                Assert.fail("Unexpected error appears while tring to open ProductID details page - " + productID + " with error msg - " + ex.getMessage());
            }
        }
    }

    public static void selectProductSize(ItemDetailsPage itemDetailPage, String productID){
        if(elementExistByCSS(ItemDetailsPage.sizeListCSS)){
            clickElement(itemDetailPage.sizeBox);
            for (WebElement el: itemDetailPage.allSizes
            ) {
                if(!el.getAttribute("class").contains("disabled")){
                    clickElement(el);
                    break;
                }
            }
            Assert.assertTrue(!itemDetailPage.sizeBox.getText().contains("Select Size"), "There is no available size for selected item - productID - " + productID);
        }
    }

    public static void badImageCheck(WebElement itemImage, String productID){
        String src = itemImage.getAttribute("src");
        if(src.contains("image.jpg") || src.contains("thumbnail.jpg")){
            Assert.fail("ProductID with bad Imange in details page  is - " + productID);
        }
    }

    public static List<WebElement> performanceGrades(String grade){
        List<WebElement> grades = driver.findElements(By.cssSelector("h2."+grade));
        return grades;
    }
}
