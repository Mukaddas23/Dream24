package validationCookiesHeadParam;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ValidationOfHeadersAndParam {
    //@Test
   /* void testHeaders(){
        given()
                .when()
                .get("https://reqres.in/api/users?page=2")

                .then()
                .header("Content-Type", "text/html;")
                .and()
                .header("Content-Encoding","gzip")
                .and()
                .header("Server", "gws")
                .log().all();
    }*/
    @Test
    void testHeaders() {
        // Set base URI to avoid repeating it in each request
        RestAssured.baseURI = "https://reqres.in";

        given()
                .when()
                .get("/api/users?page=2")
                .then()
                .header("Content-Type", "application/json; charset=utf-8")  // Adjusted Content-Type value
                .and()
                .header("Content-Encoding", "gzip")
                .and()
                .header("Server", "cloudflare")  // Adjusted Server value
                .log().all();
    }
    @Test
    void testParam(){
        given()

                .pathParams("mypath", "users") //pathParameters
                .queryParam("page",2)//query parameter
                .queryParam("id",9)//query paramenter

                .when()
                .get("https://reqres.in/api/{mypath}")

                .then()
                .statusCode(200)
                .log().all();
    }
}
