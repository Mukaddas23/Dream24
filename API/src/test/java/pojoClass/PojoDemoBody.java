package pojoClass;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PojoDemoBody {
    public static void main(String[] args) {
        PojoDemoResponse pojo=new PojoDemoResponse();
        pojo.setId(1);
        pojo.setName("Den");

        RestAssured.baseURI="http://webservice.toscacloud.com/rest/api/Profiles_V2";
        Response response=RestAssured.given()
                .contentType(ContentType.JSON)
                .header("Authorithation","db90cbec-8211-42f8-97ca-dd33eb82edfc")
                .body(pojo)

                .when()
                .post()

                .then()
                .extract().response();
        System.out.println(response.asPrettyString());
    }
}
