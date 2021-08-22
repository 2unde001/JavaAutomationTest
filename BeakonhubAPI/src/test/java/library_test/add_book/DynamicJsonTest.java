package library_test.add_book;

import files.BeakonhubReusables;
import files.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DynamicJsonTest
{
    @Test(dataProvider = "BookData")
    public void addBook(String isbn, String aisle)
    {
        RestAssured.baseURI = "http://216.10.245.166";
        String response = given().header("Content-Type", "application/json")
                .body(Payload.addBook(isbn,aisle))
                .when().post("/Library/Addbook.php")
                .then().log().all().assertThat().statusCode(200)
                .extract().response().asString();

        JsonPath js = BeakonhubReusables.jsonPath(response);
        String id = js.get("ID");
        System.out.println("Book Id is: "+id);

    }

    @DataProvider(name="BookData")
    public Object[][] getData()
    {
        return new Object[][]
        {
                {"ertysyd","67748810"},
                {"bigmia", "09322110"},
                {"Anumiv", "89321110"}
        };

    }

}
