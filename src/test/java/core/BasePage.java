package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage extends BaseSelenium {
    protected BasePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
