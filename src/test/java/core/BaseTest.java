package core;

import core.data.configurations.ConfigProvider;
import core.driver.BrowserType;
import core.driver.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest implements ConfigProvider {
    protected WebDriver driver;
    protected PageProvider pages;
    protected StepFactory steps;


    @BeforeEach
    public void setUp(){
        driver = WebDriverFactory.createDriver(BrowserType.CHROME);
        pages = new PageProvider(driver);
        steps = new StepFactory(driver, pages);
        driver.get(URL);
    }


    @AfterEach
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
