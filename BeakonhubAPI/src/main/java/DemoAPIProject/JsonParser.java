package DemoAPIProject;

import files.BeakonhubReusables;
import io.restassured.path.json.JsonPath;

import java.util.List;


public class JsonParser
{
    public static void main(String[] args)
    {
        JsonPath jsonPath =  new JsonPath(BeakonhubReusables.coursePrice());


        // Print No of courses returned by API
        int count = jsonPath.getInt("courses.size()"); // Apply only an array
        System.out.print("Total number of courses is:"+ count);
        System.out.print("\n");

        // Print Purchase Amount
        int amount = jsonPath.getInt("dashboard.purchaseAmount");
        System.out.print("Purchase amount is: "+ amount);
        System.out.print("\n");

        //Print Title of the first course
        String title = jsonPath.get("courses[0].title");
        System.out.print("First course title on the list is: "+ title);
        System.out.print("\n");

        // Print All course titles,and their respective Prices

        for (int i= 0; i < count; i++){

           String courseTitles =  jsonPath.get("courses["+i+"].title");
           System.out.println("Course title is :"+ courseTitles);

           System.out.println(jsonPath.get("courses["+i+"].price").toString());

        }

        // Print no of copies sold by RPA Course

        System.out.println("Print number of copies sold by RPA");

        for (int i = 0; i <=count; i++){

            String courseTitles =jsonPath.get("courses["+i+"].title");
            if (courseTitles.equalsIgnoreCase("RPA")){

                // return  copies
                int copies = jsonPath.get("courses["+i+"].copies");
                System.out.println(copies);
                break;
            }

        }



    }



}
