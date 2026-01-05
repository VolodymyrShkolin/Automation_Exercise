package steps;

import constants.Messages;
import core.BaseStep;

import static org.junit.jupiter.api.Assertions.*;

import core.PageProvider;
import core.StepFactory;
import org.openqa.selenium.WebDriver;

public class LoginSteps extends BaseStep {
    public LoginSteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver, pages, steps);
    }


    public void login(String email, String password){
        click(pages.mainPage().acceptCaptchaBtn);
        click(pages.mainPage().loginHref);
        pages.loginPage().emailField.sendKeys(email);
        pages.loginPage().passwordField.sendKeys(password);
        click(pages.loginPage().loginBtn);
    }

    public void validLoginData(String email, String password, String name){
        login(email, password);
        assertEquals(pages.loginPage().userName.getText(), name);
    }

    public void invalidPassword(String email, String password){
        login(email, password);
        assertEquals(Messages.loginAssertion, pages.loginPage().loginAssertion.getText());
    }

}
