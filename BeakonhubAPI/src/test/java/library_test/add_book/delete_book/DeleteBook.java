package library_test.add_book.delete_book;
import files.Payload;
import io.restassured.RestAssured;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DeleteBook
{
    @Test(dataProvider = "DeleteBooks")
    public void deleteBooks(String deleteById)
    {
        RestAssured.baseURI = "http://216.10.245.166";
        given().header("Content-Type","application/json")
                .body(Payload.deleteById(deleteById))
                .when().post("/Library/DeleteBook.php")
                .then().log().all().assertThat().statusCode(200)
                .body("msg",equalTo("book is successfully deleted"));

    }

    /**
     * Delete Created post using this method.
     * Changed the parameter each time POST is created from DynamicJasonTest class .method
    * */

    @DataProvider(name = "DeleteBooks")
    public Object[][]  deleteExistingBooks(){

        return new Object[][]
                {
                        {"Anumiv89321110"},
                        {"bigmia09322110"},
                        {"ertysyd67748810"}
                };
    }

}
