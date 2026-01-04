package core;

import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;

public final class PageProvider {
    WebDriver driver;

    public PageProvider(WebDriver driver){
        this.driver = driver;
    }

    private LoginPage loginPage;

    public LoginPage loginPage(){
        if(loginPage == null){
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
}
