package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MenuItemsPage {
    private static final String imgCSS = "img.isp_product_image";
    private static final String priceCSS = "span.current-price";
    private static final String itemsCSS = "li.isp_grid_product.quick";
    private static final String sortingCSS = "span#sorting_chosen_name";
    public static final String nextPage = "li.page-item.next";
    private static final String currencyDropDownCSS = "ul.dropdown.switcher-dropdown.ui-dialog-content.ui-widget-content";
    private static final String currencyCSS = "div#switcher-language-trigger-foote";

    @FindBy(css = imgCSS)
    public List<WebElement> itemsImg;

    @FindBy(css = priceCSS)
    public List<WebElement> itemsPrice;

    @FindBy(css = itemsCSS)
    public List<WebElement> itemsList;

    @FindBy(css = sortingCSS)
    public WebElement sorting;

    @FindBy(css = imgCSS)
    public WebElement oneImage;

    @FindBy(css = nextPage)
    public WebElement nextPageLink;
}
