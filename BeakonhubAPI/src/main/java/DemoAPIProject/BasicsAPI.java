package DemoAPIProject;
import files.BeakonhubReusables;
import files.Payload;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BasicsAPI
{
    public static void main(String[] args){

        // given - all input details
        // when - Submit API (Resource must be on the wnen())
        // Validate API
        //use log().all() -to generate response output
        // Add place and update place with the new address ->
        // Get place to validate if new address is present in response


        baseURI = "https://rahulshettyacademy.com";

        String response = given().log().all().queryParam("key","qaclick123")
                .header("Content-Type","application/json")
                .body(Payload.addPlace())
                .when().post("maps/api/place/add/json")
                .then().assertThat().statusCode(200)
                .body("scope", equalTo("APP"))
                .header("Server", equalTo("Apache/2.4.18 (Ubuntu)"))
                .extract().response().asString(); // use to extract string value

        System.out.print(response+"\n");
        JsonPath js = BeakonhubReusables.jsonPath(response);  // for parsing json
        String placeId = js.get("place_id");

        System.out.print("place_id = "+ placeId);

        // Update Address

        String newAddress = "44, Ikeja GRA,Lagos state Nigeria";
        given().log().all().queryParam("key","qaclick123")
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"place_id\":\""+placeId+"\",\n" +
                        "    \"address\":\""+newAddress+"\",\n" +
                        "    \"key\":\"qaclick123\"\n" +
                        "}")
                .when().put("maps/api/place/update/json")
                .then().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));

        // Use Get method to verify updated address
        // Add multiple query parameter

       String getPlaceResponse =  given().log().all().queryParam("key", "qaclick123")
                .queryParam("place_id", placeId)
                .when().get("/maps/api/place/get/json")
                .then().assertThat().log().all().statusCode(200)
                .extract().response().asString();

        JsonPath jsonPath = BeakonhubReusables.jsonPath(getPlaceResponse);

       // Use jsonpath to retrieve json objects or data
        System.out.print("\n");
        String actualAddress = jsonPath.getString("address");
        System.out.print("New updated address is: "+ actualAddress);
        Assert.assertEquals(newAddress,actualAddress);









//        baseURI = "https://reqres.in";
//
//        given().log().all().header("Content-Type", "application/json")
//                .body("{\n" +
//                "    \"name\": \"morpheus\",\n" +
//                "    \"job\": \"leader\"\n" +
//                "}")
//                .when().post("/api/user")
//                .then().log().all().assertThat().statusCode(201);

    }


}
