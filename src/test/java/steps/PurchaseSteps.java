package steps;

import constants.CardData;
import constants.Messages;
import core.BaseStep;
import core.PageProvider;
import core.StepFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.*;

public class PurchaseSteps extends BaseStep {
    public PurchaseSteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver, pages, steps);
    }

    public String selectProduct(){
        click(pages.mainPage().productHref);
        String productName = pages.productsPage().productName.getFirst().getText();
        click(pages.productsPage().addToCartBtn.getFirst());
        click(pages.productsPage().viewCartLink);
        return productName;
    }

    public void checkout(String productName){
        assertEquals(productName, pages.cartPage().cartDescription.getFirst().getText());
        click(pages.cartPage().cartCheckoutBtn);
    }

    public void orderProduct(){
        click(pages.checkoutPage().orderBtn);
    }

    public void payOrder(){
        pages.paymentPage().nameOnCardField.sendKeys(CardData.NAME_ON_CARD);
        pages.paymentPage().cardNumberField.sendKeys(CardData.CARD_NUMBER);
        pages.paymentPage().cvcField.sendKeys(CardData.CVC);
        pages.paymentPage().expiryMonthField.sendKeys(CardData.MONTH_EXPIRATION);
        pages.paymentPage().expiryYearField.sendKeys(CardData.YEAR_EXPIRATION);
        click(pages.paymentPage().payBtn);
    }

    public void orderConfirmation(){
        assertEquals(Messages.successfulOrder, pages.orderConfirmationPage().orderPlace.getText());
        click(pages.orderConfirmationPage().continueBtn);
        wait.until(ExpectedConditions.visibilityOf(pages.mainPage().carousel));
    }
}
