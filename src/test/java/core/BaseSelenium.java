package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public abstract class BaseSelenium {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Random random;


    protected BaseSelenium(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        random = new Random();
    }

}
