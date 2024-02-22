package httpMainMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class GetRequest1 {
    public static void main(String[] args) {
        RestAssured.baseURI="http://tosca-webservice-ng.azurewebsites.net/";


        Response response =RestAssured.when()
                .get("api/Coffees_V4/1")
                .then()
                .extract().response();
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.statusCode(),200);
    }
}
