package files;

import io.restassured.path.json.JsonPath;

public class BeakonhubReusables
{
    public static JsonPath jsonPath(String response)
    {

        JsonPath jsonPath = new JsonPath(response);
        return jsonPath;
    }

    public static String coursePrice() {
        return "{\n" +
                "  \"dashboard\": {\n" +
                "    \"purchaseAmount\": 1504,\n" +
                "    \"website\": \"rahulshettyacademy.com\"\n" +
                "  },\n" +
                "  \"courses\": [\n" +
                "    {\n" +
                "      \"title\": \"Selenium Python\",\n" +
                "      \"price\": 50,\n" +
                "      \"copies\": 6\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"Cypress\",\n" +
                "      \"price\": 40,\n" +
                "      \"copies\": 4\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"RPA\",\n" +
                "      \"price\": 45,\n" +
                "      \"copies\": 10\n" +
                "    },\n" +
                "     {\n" +
                "      \"title\": \"Appium\",\n" +
                "      \"price\": 33,\n" +
                "      \"copies\": 18\n" +
                "    }\n" +
                "  \n" +
                "  ]\n" +
                "}";
    }
}
