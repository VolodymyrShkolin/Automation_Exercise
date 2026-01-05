package pageObjects;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameField;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailField;

    @FindBy(xpath = "//textarea[@id='review']")
    public WebElement reviewField;

    @FindBy(xpath = "//button[@id='button-review']")
    public WebElement reviewBtn;

    @FindBy(xpath = "//div[@class='alert-success alert']")
    public WebElement successAlert;
}
