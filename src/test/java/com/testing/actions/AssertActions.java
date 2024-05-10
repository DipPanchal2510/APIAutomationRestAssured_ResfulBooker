package com.testing.actions;

import io.restassured.response.Response;
import static org.testng.Assert.assertEquals;

public class AssertActions {


    public void verifyStatusCode(Response response)
    {
        assertEquals(String.valueOf(response.getStatusCode()).startsWith("20"),true,
                "Value of status code is " + response.getStatusCode());
    }

    public void responseBody(String actual, String expected, String description)
    {
        assertEquals(actual,expected,description);
    }

    public void responseBody(float actual, float expected, String description)
    {
        assertEquals(actual,expected,description);
    }

    public void responseBody(int actual, int expected, String description)
    {
        assertEquals(actual,expected,description);
    }

    public void responseBody(double actual, double expected, String description)
    {
        assertEquals(actual,expected,description);
    }

}
