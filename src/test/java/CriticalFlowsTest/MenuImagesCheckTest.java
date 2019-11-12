package CriticalFlowsTest;

import TestHelpers.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.util.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MenuItemsPage;

import java.util.ArrayList;
import java.util.List;

import static TestHelpers.HelpMethods.*;

public class MenuImagesCheckTest extends BaseTest {
    private static BasePage basePage;
    private static MenuItemsPage menuItemsPage;

    @BeforeClass
    public void setUp(){
        basePage = PageFactory.initElements(driver, BasePage.class);
    }

    @AfterMethod
    public void tearDown(){
        driver.navigate().refresh();
    }


    @Test
    public void NewInTest(){
        List<String> badItems = new ArrayList<>();
        String result = new String();
        clickElement(basePage.newInMenu);
        for(int i = 0; i < 5; i++ ) {
            menuItemsPage = PageFactory.initElements(driver, MenuItemsPage.class);
            wait.until(ExpectedConditions.elementToBeClickable(menuItemsPage.oneImage));
            List<WebElement> menuItems = menuItemsPage.itemsList;
            List<WebElement> itemsImg = menuItemsPage.itemsImg;
            Assert.isTrue(menuItems.size() > 0 && menuItems.size() == itemsImg.size(), "Items count is - " + menuItems.size() + "and item image count is - " + itemsImg.size());
            for (WebElement el : itemsImg
            ) {
                String src = el.getAttribute("src");
                if (src.contains("image.jpg") || src.contains("thumbnail.jpg")) {
                    badItems.add(el.getAttribute("isp_product_id"));
                }
            }
            for (String prodID : badItems
            ) {
                result += prodID + ", ";
            }
            clickElement(menuItemsPage.nextPage);
        }
        Assert.isTrue(result.isEmpty(), "ProductID list for New In items with bad Imanges are - " + result);
    }

    @Test
    public void ClothingTest(){
        List<String> badItems = new ArrayList<>();
        String result = new String();
        clickElement(basePage.clothingMenu);
        for(int i = 0; i < 5; i++ ) {
            menuItemsPage = PageFactory.initElements(driver, MenuItemsPage.class);
            wait.until(ExpectedConditions.elementToBeClickable(menuItemsPage.oneImage));
            List<WebElement> menuItems = menuItemsPage.itemsList;
            List<WebElement> itemsImg = menuItemsPage.itemsImg;
            Assert.isTrue(menuItems.size() > 0 && menuItems.size() == itemsImg.size(), "Items count is - " + menuItems.size() + "and item image count is - " + itemsImg.size());
            for (WebElement el : itemsImg
            ) {
                String src = el.getAttribute("src");
                if (src.contains("image.jpg") || src.contains("thumbnail.jpg")) {
                    badItems.add(el.getAttribute("isp_product_id"));
                }
            }
            for (String prodID : badItems
            ) {
                result += prodID + ", ";
            }
            clickElement(menuItemsPage.nextPage);
        }
        Assert.isTrue(result.isEmpty(), "ProductID list for Clothing items with bad Imanges are - " + result);
    }

    @Test
    public void ShoesTest(){
        List<String> badItems = new ArrayList<>();
        String result = new String();
        clickElement(basePage.shoesMenu);
        for(int i = 0; i < 5; i++ ) {
            menuItemsPage = PageFactory.initElements(driver, MenuItemsPage.class);
            wait.until(ExpectedConditions.elementToBeClickable(menuItemsPage.oneImage));
            List<WebElement> menuItems = menuItemsPage.itemsList;
            List<WebElement> itemsImg = menuItemsPage.itemsImg;
            Assert.isTrue(menuItems.size() > 0 && menuItems.size() == itemsImg.size(), "Items count is - " + menuItems.size() + "and item image count is - " + itemsImg.size());
            for (WebElement el : itemsImg
            ) {
                String src = el.getAttribute("src");
                if (src.contains("image.jpg") || src.contains("thumbnail.jpg")) {
                    badItems.add(el.getAttribute("isp_product_id"));
                }
            }
            for (String prodID : badItems
            ) {
                result += prodID + ", ";
            }
            clickElement(menuItemsPage.nextPage);
        }
        Assert.isTrue(result.isEmpty(), "ProductID list for Shoes items with bad Imanges are - " + result);
    }

    @Test
    public void BagsTest(){
        List<String> badItems = new ArrayList<>();
        String result = new String();
        clickElement(basePage.bagsMenu);
        for(int i = 0; i < 5; i++ ) {
            menuItemsPage = PageFactory.initElements(driver, MenuItemsPage.class);
            wait.until(ExpectedConditions.elementToBeClickable(menuItemsPage.oneImage));
            List<WebElement> menuItems = menuItemsPage.itemsList;
            List<WebElement> itemsImg = menuItemsPage.itemsImg;
            Assert.isTrue(menuItems.size() > 0 && menuItems.size() == itemsImg.size(), "Items count is - " + menuItems.size() + "and item image count is - " + itemsImg.size());
            for (WebElement el : itemsImg
            ) {
                String src = el.getAttribute("src");
                if (src.contains("image.jpg") || src.contains("thumbnail.jpg")) {
                    badItems.add(el.getAttribute("isp_product_id"));
                }
            }
            for (String prodID : badItems
            ) {
                result += prodID + ", ";
            }
            clickElement(menuItemsPage.nextPage);
        }
        Assert.isTrue(result.isEmpty(), "ProductID list for Bags items with bad Imanges are - " + result);
    }

    @Test
    public void AccessoriesTest(){
        List<String> badItems = new ArrayList<>();
        String result = new String();
        clickElement(basePage.accessoriesMenu);
        for(int i = 0; i < 5; i++ ) {
            menuItemsPage = PageFactory.initElements(driver, MenuItemsPage.class);
            wait.until(ExpectedConditions.elementToBeClickable(menuItemsPage.oneImage));
            List<WebElement> menuItems = menuItemsPage.itemsList;
            List<WebElement> itemsImg = menuItemsPage.itemsImg;
            Assert.isTrue(menuItems.size() > 0 && menuItems.size() == itemsImg.size(), "Items count is - " + menuItems.size() + "and item image count is - " + itemsImg.size());
            for (WebElement el : itemsImg
            ) {
                String src = el.getAttribute("src");
                if (src.contains("image.jpg") || src.contains("thumbnail.jpg")) {
                    badItems.add(el.getAttribute("isp_product_id"));
                }
            }
            for (String prodID : badItems
            ) {
                result += prodID + ", ";
            }
            clickElement(menuItemsPage.nextPage);
        }
        Assert.isTrue(result.isEmpty(), "ProductID list for Accessories items with bad Imanges are - " + result);
    }

    @Test
    public void VintageTest(){
        List<String> badItems = new ArrayList<>();
        String result = new String();
        clickElement(basePage.vintageMenu);
        for(int i = 0; i < 5; i++ ) {
            menuItemsPage = PageFactory.initElements(driver, MenuItemsPage.class);
            wait.until(ExpectedConditions.elementToBeClickable(menuItemsPage.oneImage));
            List<WebElement> menuItems = menuItemsPage.itemsList;
            List<WebElement> itemsImg = menuItemsPage.itemsImg;
            Assert.isTrue(menuItems.size() > 0 && menuItems.size() == itemsImg.size(), "Items count is - " + menuItems.size() + "and item image count is - " + itemsImg.size());
            for (WebElement el : itemsImg
            ) {
                String src = el.getAttribute("src");
                if (src.contains("image.jpg") || src.contains("thumbnail.jpg")) {
                    badItems.add(el.getAttribute("isp_product_id"));
                }
            }
            for (String prodID : badItems
            ) {
                result += prodID + ", ";
            }
            clickElement(menuItemsPage.nextPage);
        }
        Assert.isTrue(result.isEmpty(), "ProductID list for Vintage items with bad Imanges are - " + result);
    }

    @Test
    public void JewelryTest(){
        List<String> badItems = new ArrayList<>();
        String result = new String();
        clickElement(basePage.jewelryMenu);
        for(int i = 0; i < 5; i++ ) {
            menuItemsPage = PageFactory.initElements(driver, MenuItemsPage.class);
            wait.until(ExpectedConditions.elementToBeClickable(menuItemsPage.oneImage));
            List<WebElement> menuItems = menuItemsPage.itemsList;
            List<WebElement> itemsImg = menuItemsPage.itemsImg;
            Assert.isTrue(menuItems.size() > 0 && menuItems.size() == itemsImg.size(), "Items count is - " + menuItems.size() + "and item image count is - " + itemsImg.size());
            for (WebElement el : itemsImg
            ) {
                String src = el.getAttribute("src");
                if (src.contains("image.jpg") || src.contains("thumbnail.jpg")) {
                    badItems.add(el.getAttribute("isp_product_id"));
                }
            }
            for (String prodID : badItems
            ) {
                result += prodID + ", ";
            }
            clickElement(menuItemsPage.nextPage);
        }
        Assert.isTrue(result.isEmpty(), "ProductID list for Jewelry items with bad Imanges are - " + result);
    }

    @Test
    public void Watches(){
        List<String> badItems = new ArrayList<>();
        String result = new String();
        clickElement(basePage.watchesMenu);
        for(int i = 0; i < 5; i++ ) {
            menuItemsPage = PageFactory.initElements(driver, MenuItemsPage.class);
            wait.until(ExpectedConditions.elementToBeClickable(menuItemsPage.oneImage));
            List<WebElement> menuItems = menuItemsPage.itemsList;
            List<WebElement> itemsImg = menuItemsPage.itemsImg;
            Assert.isTrue(menuItems.size() > 0 && menuItems.size() == itemsImg.size(), "Items count is - " + menuItems.size() + "and item image count is - " + itemsImg.size());
            for (WebElement el : itemsImg
            ) {
                String src = el.getAttribute("src");
                if (src.contains("image.jpg") || src.contains("thumbnail.jpg")) {
                    badItems.add(el.getAttribute("isp_product_id"));
                }
            }
            for (String prodID : badItems
            ) {
                result += prodID + ", ";
            }
            clickElement(menuItemsPage.nextPage);
        }
        Assert.isTrue(result.isEmpty(), "ProductID list for Watches items with bad Imanges are - " + result);
    }

    @Test
    public void HomeTest(){
        List<String> badItems = new ArrayList<>();
        String result = new String();
        clickElement(basePage.homeMenu);
        for(int i = 0; i < 5; i++ ) {
            menuItemsPage = PageFactory.initElements(driver, MenuItemsPage.class);
            wait.until(ExpectedConditions.elementToBeClickable(menuItemsPage.oneImage));
            List<WebElement> menuItems = menuItemsPage.itemsList;
            List<WebElement> itemsImg = menuItemsPage.itemsImg;
            Assert.isTrue(menuItems.size() > 0 && menuItems.size() == itemsImg.size(), "Items count is - " + menuItems.size() + "and item image count is - " + itemsImg.size());
            for (WebElement el : itemsImg
            ) {
                String src = el.getAttribute("src");
                if (src.contains("image.jpg") || src.contains("thumbnail.jpg")) {
                    badItems.add(el.getAttribute("isp_product_id"));
                }
            }
            for (String prodID : badItems
            ) {
                result += prodID + ", ";
            }
            clickElement(menuItemsPage.nextPage);
        }
        Assert.isTrue(result.isEmpty(), "ProductID list for Home items with bad Imanges are - " + result);
    }

    @Test
    public void SaleTest(){
        List<String> badItems = new ArrayList<>();
        String result = new String();
        clickElement(basePage.saleMenu);
        for(int i = 0; i < 5; i++ ) {
            menuItemsPage = PageFactory.initElements(driver, MenuItemsPage.class);
            wait.until(ExpectedConditions.elementToBeClickable(menuItemsPage.oneImage));
            List<WebElement> menuItems = menuItemsPage.itemsList;
            List<WebElement> itemsImg = menuItemsPage.itemsImg;
            Assert.isTrue(menuItems.size() > 0 && menuItems.size() == itemsImg.size(), "Items count is - " + menuItems.size() + "and item image count is - " + itemsImg.size());
            for (WebElement el : itemsImg
            ) {
                String src = el.getAttribute("src");
                if (src.contains("image.jpg") || src.contains("thumbnail.jpg")) {
                    badItems.add(el.getAttribute("isp_product_id"));
                }
            }
            for (String prodID : badItems
            ) {
                result += prodID + ", ";
            }
            clickElement(menuItemsPage.nextPage);
        }
        Assert.isTrue(result.isEmpty(), "ProductID list for Sale items with bad Imanges are - " + result);
    }


}
