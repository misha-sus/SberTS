package perf.lab.pojo;

import io.qameta.allure.Step;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.*;

import static io.restassured.RestAssured.given;

public class RestTest {
    static RequestSpecification spec;

    @BeforeClass
    public void setUP() {
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBaseUri("http://users.bugred.ru/tasks")
                .setBasePath("/rest/createuser")
                .setContentType(ContentType.JSON);
        spec = builder.build();

    }

    @DataProvider(name = "nameUser")
    public Object[][] getData() {
        String email = UUID.randomUUID().toString();
        String name = UUID.randomUUID().toString();
        return new Object[][]{{email.replace("-", "") + "@mail.ru", (name.replace("-", ""))}};
    }

    @Step("Отправка запроса")
    @Test(dataProvider = "nameUser", description = "Позитивный сценарий создания пользователя")
    public void check(String email, String name) {
        User userReq = new User(email, name, Arrays.asList(8), Arrays.asList(37, 38), "Стрельба из лука, Настолки", "адрес 1", "Тестовый, ясен пень", "333 33 33");
        UserResponse userRes = given()
                .spec(spec)
                .body(userReq)
                .when()
                .filter(new AllureRestAssured())
                .post()
                .then()
                .log().all()
                .extract().as(UserResponse.class);

        validResponse(userReq, userRes);
    }

    @Step("Валидация ответа")
    public static void validResponse(User userReq, UserResponse userRes) {
        Assert.assertEquals(userReq.email, userRes.email);
        Assert.assertEquals(userReq.name, userRes.name);
        Assert.assertEquals(userReq.hobby, userRes.hobby);
        Assert.assertEquals(userReq.phone, userRes.phone);
    }
}


