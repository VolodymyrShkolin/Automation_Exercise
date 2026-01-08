package steps;

import constants.Messages;
import core.BaseStep;
import core.PageProvider;
import core.StepFactory;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class APISteps extends BaseStep {
    public APISteps(WebDriver driver, PageProvider pages, StepFactory steps) {
        super(driver, pages, steps);
    }

    public void postToAllProduct(String url){
        JsonPath jsonPath = RestAssured.given()
                .filter(new AllureRestAssured())
                .post(url+"/api/productsList")
                .then()
                .extract()
                .jsonPath();

        assertEquals(405, jsonPath.getInt("responseCode"));
        assertEquals(Messages.statusCode405, jsonPath.getString("message"));
    }

    public void getUserEmail(String url, String email, String userName){
        JsonPath jsonPath = RestAssured.given()
                .filter(new AllureRestAssured())
                .queryParam("email", email)
                .get(url+"/api/getUserDetailByEmail")
                .then()
                .extract()
                .jsonPath();

//        String response = RestAssured.given()
//                .queryParam("email", email)
//                .get(url+"/api/getUserDetailByEmail")
//                .then()
//                .extract()
//                .body()
//                .asString();
//
//
//        System.out.println(response);

        assertEquals(200, jsonPath.getInt("responseCode"));
        assertEquals(userName, jsonPath.getString("user.name"));
    }
}
