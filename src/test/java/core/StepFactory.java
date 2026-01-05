package core;

import org.openqa.selenium.WebDriver;
import steps.LoginSteps;
import steps.PurchaseSteps;
import steps.ReviewSteps;

public final class StepFactory {
    WebDriver driver;
    PageProvider pages;

    public StepFactory(WebDriver driver, PageProvider pages){
        this.driver = driver;
        this.pages = pages;
    }

    private LoginSteps loginSteps;
    private PurchaseSteps purchaseSteps;
    private ReviewSteps reviewSteps;

    public ReviewSteps reviewSteps(){
        if(reviewSteps == null){
            reviewSteps = new ReviewSteps(driver, pages, this);
        }
        return reviewSteps;
    }

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
