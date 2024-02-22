package validationCookiesHeadParam;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class ValidationOfCookies {
    @Test
     void getCookiesInfo(){
       /* Response res= given()
                .when()
                .get("https://www.google.com/");
                // get single cookie
        String cookie_value= res.getCookies("AES");
        System.out.println(("value of cookieis===> "+cookie_value));*/
        Response res = given()

                .when()
                .get("https://www.google.com/");
        // get single single cookie
        // String cookie_value = res.getCookie("AEC");
        //  System.out.println("value of cookie is ====> "+cookie_value);
        //get all cookies info
        Map<String, String> cookies_value = res.getCookies();
        // System.out.println(cookies_value.keySet());

        for(String k: cookies_value.keySet()){
            String cookie_value = res.cookie(k);
            System.out.println(k+"   "+cookie_value);
        }
    }

}
