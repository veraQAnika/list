package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
    private static final String newIn = "New In";
    private static final String clothing = "Clothing";
    private static final String shoes = "Shoes";
    private static final String bags = "Bags";
    private static final String accessories = "Accessories";
    private static final String vintage = "Vintage";
    private static final String jewelry = "Jewelry";
    private static final String watches = "Watches";
    private static final String home = "Home";
    private static final String sale = "Sale";
    private static final String editorial = "Editorial";

    private static final String accountCSS = "a#authorization-trigger";
    private static final String createAccountCSS = "a.creat-account-box";
    private static final String myCartCSS = "a.action.showcart.active";
    private static final String searchCSS = "input#search";

    @FindBy(xpath = "//span[text()='"+newIn+"']")
    public WebElement newInMenu;

    @FindBy(xpath = "//span[text()='"+clothing+"']")
    public WebElement clothingMenu;

    @FindBy(xpath = "//span[text()='"+shoes+"']")
    public WebElement shoesMenu;

    @FindBy(xpath = "//span[text()='"+bags+"']")
    public WebElement bagsMenu;

    @FindBy(xpath = "//span[text()='"+accessories+"']")
    public WebElement accessoriesMenu;

    @FindBy(xpath = "//span[text()='"+vintage+"']")
    public WebElement vintageMenu;

    @FindBy(xpath = "//span[text()='"+jewelry+"']")
    public WebElement jewelryMenu;

    @FindBy(xpath = "//span[text()='"+watches+"']")
    public WebElement watchesMenu;

    @FindBy(xpath = "//span[text()='"+home+"']")
    public WebElement homeMenu;

    @FindBy(xpath = "//span[text()='"+sale+"']")
    public WebElement saleMenu;

    @FindBy(xpath = "//span[text()='"+editorial+"']")
    public WebElement editorialMenu;

    @FindBy(css = accountCSS)
    public WebElement accountIcon;

    @FindBy(css = createAccountCSS)
    public WebElement createAccount;

    @FindBy(css = myCartCSS)
    public WebElement myCart;

    @FindBy(css = searchCSS)
    public WebElement search;
}