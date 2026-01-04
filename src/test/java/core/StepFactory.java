package core;

import org.openqa.selenium.WebDriver;
import steps.LoginSteps;

public final class StepFactory {
    WebDriver driver;
    PageProvider pages;

    public StepFactory(WebDriver driver, PageProvider pages){
        this.driver = driver;
        this.pages = pages;
    }

    private LoginSteps loginSteps;

    public LoginSteps loginSteps(){
        if(loginSteps == null){
            loginSteps = new LoginSteps(driver, pages, this);
        }
        return loginSteps;
    }
}
