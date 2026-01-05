package pageObjects;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PaymentPage extends BasePage {
    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@data-qa='name-on-card']")
    public WebElement nameOnCardField;

    @FindBy(xpath = "//input[@data-qa='card-number']")
    public WebElement cardNumberField;

    @FindBy(xpath = "//input[@data-qa='cvc']")
    public WebElement cvcField;

    @FindBy(xpath = "//input[@data-qa='expiry-month']")
    public WebElement expiryMonthField;

    @FindBy(xpath = "//input[@data-qa='expiry-year']")
    public WebElement expiryYearField;

    @FindBy(xpath = "//button[@data-qa='pay-button']")
    public WebElement payBtn;
}
