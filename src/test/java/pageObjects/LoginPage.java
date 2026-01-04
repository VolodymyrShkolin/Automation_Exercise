package pageObjects;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginHref;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement emailField;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement passwordField;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginBtn;

    @FindBy(xpath = "//li/a/b")
    public WebElement userName;

    @FindBy(xpath = "//button[contains(@class, 'fc-cta-consent')]")
    public WebElement acceptCaptchaBtn;

    @FindBy(xpath = "//p[@style='color: red;']")
    public WebElement loginAssertion;
}
