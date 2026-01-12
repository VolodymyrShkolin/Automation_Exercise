package core;

import core.data.configurations.ConfigProvider;
import core.driver.BrowserType;
import core.driver.WebDriverFactory;
import core.extensions.MonitorRule;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

@ExtendWith(MonitorRule.class)
public abstract class BaseTest implements ConfigProvider {
    protected WebDriver driver;
    protected PageProvider pages;
    protected StepFactory steps;
    public static ThreadLocal<byte[]> screenshot = new ThreadLocal<>();


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
            screenshot.set(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
            driver.quit();
        }
    }
}
