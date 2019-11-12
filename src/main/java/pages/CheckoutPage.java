package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutPage {
    private static final String proceedToPaymentCSS = "button.shipping-continue-button";
    private static final String goTheListCSS = "div.checkout-logo.pull-left";

    @FindBy(css = proceedToPaymentCSS)
    public WebElement proceedToPayment;

    @FindBy(css = goTheListCSS)
    public WebElement goTheList;
}
