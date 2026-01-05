package pageObjects;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginHref;

    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productHref;

    @FindBy(xpath = "//button[contains(@class, 'fc-cta-consent')]")
    public WebElement acceptCaptchaBtn;
    @FindBy(xpath = "//div[@id='slider-carousel'][@class='carousel slide']")
    public WebElement carousel;
}
