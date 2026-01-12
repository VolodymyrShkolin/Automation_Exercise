package steps;

import constants.CardData;
import constants.Messages;
import core.BaseStep;
import core.PageProvider;
import core.StepFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static core.data.configurations.ConfigProvider.EMAIL;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewSteps extends BaseStep {
    public ReviewSteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver, pages, steps);
    }

    @Step("Add a review")
    public void addReview(){
        click(pages.productsPage().viewProductHref.getFirst());
        pages.productPage().nameField.sendKeys(CardData.NAME_ON_CARD);
        pages.productPage().emailField.sendKeys(EMAIL);
        pages.productPage().reviewField.sendKeys(Messages.productReview);
        click(pages.productPage().reviewBtn);
        wait.until(ExpectedConditions.visibilityOf(pages.productPage().successAlert));
        assertEquals(Messages.successAlert, pages.productPage().successAlert.getText());
    }
}
