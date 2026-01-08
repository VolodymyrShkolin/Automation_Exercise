package tests.api;

import core.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("API tests")
public class ApiTests extends BaseTest {

    @Test
    public void postToAllProductList(){
        steps.apiSteps().postToAllProduct(URL);
    }

    @Test
    public void getUserDetailByEmail(){
        steps.apiSteps().getUserEmail(URL, EMAIL, USER_NAME);
    }
}
