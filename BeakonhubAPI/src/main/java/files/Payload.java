package files;

public class Payload
{

    public static String addPlace(){

        return "{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -38.383494,\n" +
                "    \"lng\": 33.427362\n" +
                "  },\n" +
                "  \"accuracy\": 50,\n" +
                "  \"name\": \"Beakonhub\",\n" +
                "  \"phone_number\": \"(+44) 983 3322 453\",\n" +
                "  \"address\": \"427, Manchester Road, Manchester\",\n" +
                "  \"types\": [\n" +
                "    \"shoe park\",\n" +
                "    \"shop\"\n" +
                "  ],\n" +
                "  \"website\": \"http://google.com\",\n" +
                "  \"language\": \"French-IN\"\n" +
                "}";
    }

    public static String addBook()
    {
        return "{\n" +
                "    \"name\": \"How To Win A Friend\",\n" +
                "    \"isbn\":\"XYDZA\",\n" +
                "    \"aisle\":\"5466\",\n" +
                "    \"author\":\"Anu Hammed\"\n" +
                "}";
    }

    // Dynamic way to change book isbn and aisle so that we can change
    // our isbn and aisle dynamically from the test

    public static String addBook(String isbn, String aisle)
    {
        return "{\n" +
                "    \"name\": \"How To Win A Friend\",\n" +
                "    \"isbn\":\""+isbn+"\",\n" +
                "    \"aisle\":\""+aisle+"\",\n" +
                "    \"author\":\"Anu Hammed\"\n" +
                "}";
    }

    public static String deleteById(String id)
    {
        return "{\n" +
                "    \"ID\": \""+id+"\"\n" +
                "}";

    }
}
