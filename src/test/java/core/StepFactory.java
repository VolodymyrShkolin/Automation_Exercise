package core;

import org.openqa.selenium.WebDriver;
import steps.LoginSteps;
import steps.PurchaseSteps;

public final class StepFactory {
    WebDriver driver;
    PageProvider pages;

    public StepFactory(WebDriver driver, PageProvider pages){
        this.driver = driver;
        this.pages = pages;
    }

    private LoginSteps loginSteps;
    private PurchaseSteps purchaseSteps;

    public LoginSteps loginSteps(){
        if(loginSteps == null){
            loginSteps = new LoginSteps(driver, pages, this);
        }
        return loginSteps;
    }

    public PurchaseSteps purchaseSteps(){
        if(purchaseSteps == null){
            purchaseSteps = new PurchaseSteps(driver, pages, this);
        }
        return purchaseSteps;
    }
}
