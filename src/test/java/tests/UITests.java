package tests;

import core.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("UI tests")
public class UITests extends BaseTest {

    @DisplayName("Login User with correct email and password")
    @Test
    public void correctLogin(){
        steps.loginSteps().validLoginData(EMAIL, PASSWORD, USER_NAME);
    }

    @DisplayName("Login User with incorrect password")
    @Test
    public void incorrectLogin(){
        steps.loginSteps().invalidPassword(EMAIL, INVALID_PASSWORD);
    }
}
