package videoGames.get;

import Hook.Hooks;
import base.BaseURL;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetVideoGamesTest extends Hooks
{
    @Test
    public void getAllVideoGames()
    {
        given().when().get("videogames")
                .then().assertThat().log().all().statusCode(200);

    }
}
