package library_test.add_book.get_book;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetABook
{
    @Test
    public void addBook()
    {
        RestAssured.baseURI = "http://216.10.245.166";


    }
}
