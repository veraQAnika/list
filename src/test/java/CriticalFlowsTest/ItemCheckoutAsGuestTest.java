package CriticalFlowsTest;

import TestHelpers.BaseTest;
import helpers.MainHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckoutPage;
import pages.ItemDetailsPage;
import pages.MenuItemsPage;

import java.util.ArrayList;
import java.util.List;

import static TestHelpers.HelpMethods.*;

public class ItemCheckoutAsGuestTest extends BaseTest {
    private static BasePage basePage;
    private static MenuItemsPage menuItemsPage;
    private static ItemDetailsPage itemDetailPage;
    private static CheckoutPage checkoutPage;

    @BeforeClass
    public void setUp(){
        basePage = PageFactory.initElements(driver, BasePage.class);
    }

    @AfterMethod
    public void tearDown(){
        driver.manage().deleteAllCookies();
        driver.navigate().to(MainHelpers.PROTOCOL +
                "://" +
                MainHelpers.getURL());
        wait.until(ExpectedConditions.elementToBeClickable(basePage.newInMenu));
        if(elementExistByCSS("button.action.allow.primary")){
           clickElement(driver.findElement(By.cssSelector("button.action.allow.primary")));
        }
    }

    @Test
    public void newInItemCheckoutGuestTest() throws InterruptedException {
        List<String> badItems = new ArrayList<>();
        String result = new String();
        clickElement(basePage.newInMenu);
        menuItemsPage = PageFactory.initElements(driver, MenuItemsPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(menuItemsPage.oneImage));
        List<WebElement> menuItems = menuItemsPage.itemsList;
        int random = getRandom(menuItems.size());
        WebElement selectedItem = menuItems.get(random);
        String productID = selectedItem.getAttribute("product_id");
        WebElement selectedIMG = menuItemsPage.itemsImg.get(random);
        clickElement(selectedIMG);

        itemDetailPage = PageFactory.initElements(driver, ItemDetailsPage.class);
        openDetailsPage(itemDetailPage.itemImage, productID);
        badImageCheck(itemDetailPage.itemImage, productID);
        selectProductSize(itemDetailPage, productID);
        clickElement(itemDetailPage.buyNowBtn);
        checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.proceedToPayment));
    }

    @Test
    public void clothingItemCheckoutGuestTest() throws InterruptedException {
        List<String> badItems = new ArrayList<>();
        String result = new String();
        clickElement(basePage.clothingMenu);
        menuItemsPage = PageFactory.initElements(driver, MenuItemsPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(menuItemsPage.oneImage));
        List<WebElement> menuItems = menuItemsPage.itemsList;
        int random = getRandom(menuItems.size());
        WebElement selectedItem = menuItems.get(random);
        String productID = selectedItem.getAttribute("product_id");
        WebElement selectedIMG = menuItemsPage.itemsImg.get(random);
        clickElement(selectedIMG);

        itemDetailPage = PageFactory.initElements(driver, ItemDetailsPage.class);
        openDetailsPage(itemDetailPage.itemImage, productID);
        badImageCheck(itemDetailPage.itemImage, productID);
        selectProductSize(itemDetailPage, productID);
        clickElement(itemDetailPage.buyNowBtn);
        checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.proceedToPayment));
    }

    @Test
    public void shoesItemCheckoutGuestTest() throws InterruptedException {
        List<String> badItems = new ArrayList<>();
        String result = new String();
        clickElement(basePage.shoesMenu);
        menuItemsPage = PageFactory.initElements(driver, MenuItemsPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(menuItemsPage.oneImage));
        List<WebElement> menuItems = menuItemsPage.itemsList;
        int random = getRandom(menuItems.size());
        WebElement selectedItem = menuItems.get(random);
        String productID = selectedItem.getAttribute("product_id");
        WebElement selectedIMG = menuItemsPage.itemsImg.get(random);
        clickElement(selectedIMG);

        itemDetailPage = PageFactory.initElements(driver, ItemDetailsPage.class);
        openDetailsPage(itemDetailPage.itemImage, productID);
        badImageCheck(itemDetailPage.itemImage, productID);
        selectProductSize(itemDetailPage, productID);
        clickElement(itemDetailPage.buyNowBtn);
        checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.proceedToPayment));
    }

    @Test
    public void bagItemCheckoutGuestTest() throws InterruptedException {
        List<String> badItems = new ArrayList<>();
        String result = new String();
        clickElement(basePage.bagsMenu);
        menuItemsPage = PageFactory.initElements(driver, MenuItemsPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(menuItemsPage.oneImage));
        List<WebElement> menuItems = menuItemsPage.itemsList;
        int random = getRandom(menuItems.size());
        WebElement selectedItem = menuItems.get(random);
        String productID = selectedItem.getAttribute("product_id");
        WebElement selectedIMG = menuItemsPage.itemsImg.get(random);
        clickElement(selectedIMG);

        itemDetailPage = PageFactory.initElements(driver, ItemDetailsPage.class);
        openDetailsPage(itemDetailPage.itemImage, productID);
        badImageCheck(itemDetailPage.itemImage, productID);
        selectProductSize(itemDetailPage, productID);
        clickElement(itemDetailPage.buyNowBtn);
        checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.proceedToPayment));
    }
    @Test
    public void accessoriesItemCheckoutGuestTest() throws InterruptedException {
        List<String> badItems = new ArrayList<>();
        String result = new String();
        clickElement(basePage.accessoriesMenu);
        menuItemsPage = PageFactory.initElements(driver, MenuItemsPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(menuItemsPage.oneImage));
        List<WebElement> menuItems = menuItemsPage.itemsList;
        int random = getRandom(menuItems.size());
        WebElement selectedItem = menuItems.get(random);
        String productID = selectedItem.getAttribute("product_id");
        WebElement selectedIMG = menuItemsPage.itemsImg.get(random);
        clickElement(selectedIMG);

        itemDetailPage = PageFactory.initElements(driver, ItemDetailsPage.class);
        openDetailsPage(itemDetailPage.itemImage, productID);
        badImageCheck(itemDetailPage.itemImage, productID);
        selectProductSize(itemDetailPage, productID);
        clickElement(itemDetailPage.buyNowBtn);
        checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.proceedToPayment));
    }

    @Test
    public void vintageItemCheckoutGuestTest() throws InterruptedException {
        List<String> badItems = new ArrayList<>();
        String result = new String();
        clickElement(basePage.vintageMenu);
        menuItemsPage = PageFactory.initElements(driver, MenuItemsPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(menuItemsPage.oneImage));
        List<WebElement> menuItems = menuItemsPage.itemsList;
        int random = getRandom(menuItems.size());
        WebElement selectedItem = menuItems.get(random);
        String productID = selectedItem.getAttribute("product_id");
        WebElement selectedIMG = menuItemsPage.itemsImg.get(random);
        clickElement(selectedIMG);

        itemDetailPage = PageFactory.initElements(driver, ItemDetailsPage.class);
        openDetailsPage(itemDetailPage.itemImage, productID);
        badImageCheck(itemDetailPage.itemImage, productID);
        selectProductSize(itemDetailPage, productID);
        clickElement(itemDetailPage.buyNowBtn);
        checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.proceedToPayment));
    }

    @Test
    public void jewelryItemCheckoutGuestTest() throws InterruptedException {
        List<String> badItems = new ArrayList<>();
        String result = new String();
        clickElement(basePage.jewelryMenu);
        menuItemsPage = PageFactory.initElements(driver, MenuItemsPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(menuItemsPage.oneImage));
        List<WebElement> menuItems = menuItemsPage.itemsList;
        int random = getRandom(menuItems.size());
        WebElement selectedItem = menuItems.get(random);
        String productID = selectedItem.getAttribute("product_id");
        WebElement selectedIMG = menuItemsPage.itemsImg.get(random);
        clickElement(selectedIMG);

        itemDetailPage = PageFactory.initElements(driver, ItemDetailsPage.class);
        openDetailsPage(itemDetailPage.itemImage, productID);
        badImageCheck(itemDetailPage.itemImage, productID);
        selectProductSize(itemDetailPage, productID);
        clickElement(itemDetailPage.buyNowBtn);
        checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.proceedToPayment));
    }
    @Test
    public void watchesItemCheckoutGuestTest() throws InterruptedException {
        List<String> badItems = new ArrayList<>();
        String result = new String();
        clickElement(basePage.watchesMenu);
        menuItemsPage = PageFactory.initElements(driver, MenuItemsPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(menuItemsPage.oneImage));
        List<WebElement> menuItems = menuItemsPage.itemsList;
        int random = getRandom(menuItems.size());
        WebElement selectedItem = menuItems.get(random);
        String productID = selectedItem.getAttribute("product_id");
        WebElement selectedIMG = menuItemsPage.itemsImg.get(random);
        clickElement(selectedIMG);

        itemDetailPage = PageFactory.initElements(driver, ItemDetailsPage.class);
        openDetailsPage(itemDetailPage.itemImage, productID);
        String src = itemDetailPage.itemImage.getAttribute("src");
        badImageCheck(itemDetailPage.itemImage, productID);
        selectProductSize(itemDetailPage, productID);
        clickElement(itemDetailPage.buyNowBtn);
        checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.proceedToPayment));
    }

    @Test
    public void homeItemCheckoutGuestTest() throws InterruptedException {
        List<String> badItems = new ArrayList<>();
        String result = new String();
        clickElement(basePage.homeMenu);
        menuItemsPage = PageFactory.initElements(driver, MenuItemsPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(menuItemsPage.oneImage));
        List<WebElement> menuItems = menuItemsPage.itemsList;
        int random = getRandom(menuItems.size());
        WebElement selectedItem = menuItems.get(random);
        String productID = selectedItem.getAttribute("product_id");
        WebElement selectedIMG = menuItemsPage.itemsImg.get(random);
        clickElement(selectedIMG);

        itemDetailPage = PageFactory.initElements(driver, ItemDetailsPage.class);
        openDetailsPage(itemDetailPage.itemImage, productID);
        badImageCheck(itemDetailPage.itemImage, productID);
        selectProductSize(itemDetailPage, productID);
        clickElement(itemDetailPage.buyNowBtn);
        checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.proceedToPayment));
    }
    @Test
    public void saleItemCheckoutGuestTest() throws InterruptedException {
        List<String> badItems = new ArrayList<>();
        String result = new String();
        clickElement(basePage.saleMenu);
        menuItemsPage = PageFactory.initElements(driver, MenuItemsPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(menuItemsPage.oneImage));
        List<WebElement> menuItems = menuItemsPage.itemsList;
        int random = getRandom(menuItems.size());
        WebElement selectedItem = menuItems.get(random);
        String productID = selectedItem.getAttribute("product_id");
        WebElement selectedIMG = menuItemsPage.itemsImg.get(random);
        clickElement(selectedIMG);

        itemDetailPage = PageFactory.initElements(driver, ItemDetailsPage.class);
        openDetailsPage(itemDetailPage.itemImage, productID);
        badImageCheck(itemDetailPage.itemImage, productID);
        selectProductSize(itemDetailPage, productID);
        clickElement(itemDetailPage.buyNowBtn);
        checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.proceedToPayment));
    }


}
