package DemoAPIProject;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class RegRequestAPITest
{
    @Test
    public void addUsers()
    {
        baseURI = "https://reqres.in";
        given().header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}")
                .when().post("api/users")
                .then().log().all().assertThat().statusCode(201);


    }

    @Test
    public void updateUser()
    {
        baseURI = "https://reqres.in";

        given().log().all()
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"name\": \"Ayoola\",\n" +
                        "    \"job\": \"Altomation Test Engineer\",\n" +
                        "    \"id\": \"761\"\n" +
                        "    \n" +
                        "}")
                .when().put("user/2")
                .then().log().all().assertThat().statusCode(201);



    }

}
