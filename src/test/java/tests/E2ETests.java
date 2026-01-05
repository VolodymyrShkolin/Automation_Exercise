package tests;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("E2E tests")
public class E2ETests extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        steps.loginSteps().login(EMAIL, PASSWORD);
    }

    @DisplayName("Place Order: Login before Checkout")
    @Test
    public void placeOrder(){
        var productName = steps.purchaseSteps().selectProduct();
        steps.purchaseSteps().checkout(productName);
        steps.purchaseSteps().orderProduct();
        steps.purchaseSteps().payOrder();
        steps.purchaseSteps().orderConfirmation();
    }

    @DisplayName("Add review on product")
    @Test
    public void reviewOnProduct(){
        steps.reviewSteps().addReview();
    }
}
