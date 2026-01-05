package core;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public abstract class BaseSelenium {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Random random;
    protected JavascriptExecutor js;


    protected BaseSelenium(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        random = new Random();
        js = (JavascriptExecutor)driver;
    }

    protected void click(WebElement element){
        try {
            element.click();
        }catch (ElementClickInterceptedException e){
            js.executeScript("arguments[0].click();", element);
        }
    }

}
