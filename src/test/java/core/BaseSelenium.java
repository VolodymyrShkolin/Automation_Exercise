package core;

import io.restassured.RestAssured;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
            wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        }catch (ElementClickInterceptedException e){
            js.executeScript("arguments[0].click();", element);
        }
    }

    protected boolean isVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

}
