package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ItemDetailsPage {
    private static final String buyNowCSS = "button#buy-now";
    private static final String addToBagCSS = "button#product-addtocart-button";
    private static final String imageCSS = "div.zoomWindow";
    private static final String imgCSS = "img.fotorama__img";
    public static final String sizeListCSS = "span#select-swatch-option";
    private static final String sizeDisabledCSS = "div.swatch-option.text.options-padd.disabled";
    private static final String sizesCSS = "div.swatch-option.text.options-padd";

    @FindBy(css = buyNowCSS)
    public WebElement buyNowBtn;

    @FindBy(css = addToBagCSS)
    public WebElement addToBagBtn;

    @FindBy(css = imgCSS)
    public List<WebElement> itemImages;

    @FindBy(css = imgCSS)
    public WebElement itemImage;

    @FindBy(css = sizeListCSS)
    public WebElement sizeBox;

    @FindBy(css = sizeDisabledCSS)
    public List<WebElement> disabledSizes;

    @FindBy(css = sizesCSS)
    public List<WebElement> allSizes;
}
