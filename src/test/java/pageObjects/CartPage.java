package pageObjects;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//td[@class='cart_description'] //a")
    public List<WebElement> cartDescription;

    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    public WebElement cartCheckoutBtn;
}
