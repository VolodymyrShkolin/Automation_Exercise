package tests.api;

import core.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("API tests")
public class ApiTests extends BaseTest {

    @DisplayName("Post to all product list")
    @Test
    public void postToAllProductList(){
        steps.apiSteps().postToAllProduct(URL);
    }

    @DisplayName("Get user detail by email")
    @Test
    public void getUserDetailByEmail(){
        steps.apiSteps().getUserEmail(URL, EMAIL, USER_NAME);
    }
}
