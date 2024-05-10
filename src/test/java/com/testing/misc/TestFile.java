package com.testing.misc;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class TestFile {

    @Test
    public void postRequest_Token()
    {
        String paylod="{\n" +
                "        \"username\" : \"admin\",\n" +
                "            \"password\" : \"password123\"\n" +
                "    }";

        RestAssured
                .given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .when().body(paylod).post()
                .then().log().all().statusCode(200);



    }
}
