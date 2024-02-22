package pojoClass;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;

public class Authentication {
    public static void main(String[] args) {
        BodyOfAuthentication pojo = new BodyOfAuthentication();
        pojo.setDescription("Black");
        pojo.setName("Cappuccino");
        pojo.setId(2);

        RestAssured.baseURI = "http://webservice.toscacloud.com/rest/api/Coffees_V2";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .header("Authorization","Bearer db90cbec-8211-42f8-97ca-dd33eb82edfc")
                .and()
                .body(pojo)
                .when()
                .post()
                .then()
                .extract().response();
        System.out.println(response.asPrettyString());
        String name =response.jsonPath().getString("Name");
        System.out.println(name);
        Assert.assertEquals(pojo.getDescription(),"Black");

        Assert.assertEquals(response.statusCode(),200);
        Assert.assertEquals(name,"Cappuccino");


    }
}

