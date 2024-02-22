package pojoClass;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Reqres {
    public static void main(String[] args) {
        PojoFromReqres pojo= new PojoFromReqres();
        pojo.setName("Morgan");
        pojo.setJob("QA engineer");

        RestAssured.baseURI= "https://reqres.in/api/users";
        Response response=RestAssured.given()
                .contentType(ContentType.JSON)
                .and()
                .body(pojo)
                .when()
                .post()
                .then()
                .extract().response();
        System.out.println(response.asPrettyString());

    }
}
