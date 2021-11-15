package videoGames.post;

import Hook.Hooks;
import org.testng.annotations.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class AddNewVideoGame extends Hooks
{
    @Test
    public void addVideoGame() throws IOException {

        HashMap data = new HashMap<String, String>();
        data.put("id", "50");
        data.put("name", "string");
        data.put("releaseDate", "2021-08-31T03:43:41.495Z");
        data.put("reviewScore", "0");
        data.put("category", "string");
        data.put("rating", "string");
        given().log().all().contentType("application/json")
                //.body(new String(Files.readAllBytes(Paths.get("src/main/java/files/addVideoGameData.json"))))
                .body(data)
                .when().post("videogames")
                .then().assertThat().log().all().statusCode(200)
                .body("status",equalTo("Record Added Successfully"));

    }


}
