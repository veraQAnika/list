package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebPerformancePage {
    public static final String webPageTestUrl = "https://www.webpagetest.org";
    private static final String startTestCss = "button.start_test";
    private static final String webSiteUrlCss = "input#url";
    private static final String avarageCss = "div#average";


    @FindBy(css = startTestCss)
    public WebElement startTest;

    @FindBy(css = webSiteUrlCss)
    public WebElement webSiteUrl;

    @FindBy(css = avarageCss)
    public WebElement avarageResul;
}
