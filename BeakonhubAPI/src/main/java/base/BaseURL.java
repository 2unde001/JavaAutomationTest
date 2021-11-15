package base;

import io.restassured.RestAssured;

public class BaseURL
{
    public static void URI()
    {
        RestAssured.baseURI = "http://localhost:8080/app/";
    }
}
