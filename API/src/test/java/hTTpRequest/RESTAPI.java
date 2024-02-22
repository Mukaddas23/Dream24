package hTTpRequest;



import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;


public class RESTAPI {
    /*Gherkin language
    * given()
    * content type,set cookies, add auth, add param, set headers
    *
    * when()
    * get,post,put,delete
    *
    * then()
    * validate status code , extract response, extract headers, coocies & response bodies*/
    int id;
    @Test
    void getUsers(){
        given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("page",equalTo(2))
                .log().all();



    }
    @Test(priority =2)
    void createUser(){
        HashMap data =new HashMap();
        data.put("name","Anna");
        id= given()
                .contentType("application/json")
                .body(data)
                .when()
                .post("https://reqres.in/api/users")
                .jsonPath().getInt("id");
    }



    @Test(priority=4)
    void delete(){
        given()
                .when()
                .delete("https://reqres.in/api/users"+id)
                .then()
                .statusCode(204)
                .log().all();

    }

}
