package httpMainMethod;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HTTPFullRequest {
    public static void main(String[] args) {



                RestAssured.baseURI="https://tosca-webservice-ng.azurewebsites.net/api/Coffees_V4";
                String rbody = """
                          {
                          "description": "Car",
                          "name": "washing"
                        }

                                    """;
                Response response = RestAssured.given().
                        contentType(ContentType.JSON).
                        and().body(rbody).
                        when().post().
                        then().
                        extract().response();
                System.out.println(response.asPrettyString());

                int id = response.jsonPath().getInt("id");
                System.out.println(id);

                Response response1 = RestAssured.given().
                        contentType(ContentType.JSON).
                        when().
                        get().
                        then().
                        extract().response();
                System.out.println(response1.asPrettyString());

                Response response2 = RestAssured.given().
                        contentType(ContentType.JSON).
                        when().
                        delete("/"+id).
                        then().
                        extract().response();
                System.out.println(response2.asPrettyString());


        }

    }



