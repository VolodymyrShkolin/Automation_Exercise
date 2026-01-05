package pageObjects;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='col-sm-4'] //a[@data-product-id]")
    public List<WebElement> addToCartBtn;

    @FindBy(xpath = "//div[@class='single-products'] //p")
    public List<WebElement> productName;

    @FindBy(xpath = "//div[@class='modal-body'] //a[@href='/view_cart']")
    public WebElement viewCartLink;
}
