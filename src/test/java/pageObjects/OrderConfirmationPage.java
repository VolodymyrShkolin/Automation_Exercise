package pageObjects;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OrderConfirmationPage extends BasePage {
    public OrderConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[@data-qa='order-placed'] /.. /p")
    public WebElement orderPlace;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueBtn;
}
