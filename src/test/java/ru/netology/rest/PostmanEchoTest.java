
package ru.netology.rest;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostmanEchoTest {

    @Test
    void shouldReturnStatusCode200AndSomeData() {

        given()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("some data"));
    }

    @Test
    void shouldReturnStatusCode200AndData() {

        given()
                .baseUri("https://postman-echo.com")
                .body("05.11.2023")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("05.11.2023"));
    }
}
