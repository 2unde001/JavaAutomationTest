package DemoAPIProject;

import files.BeakonhubReusables;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumValidation
{
   @Test
    public void sumOfCourses(){

       int sum = 0;
       JsonPath jsonPath = new JsonPath(BeakonhubReusables.coursePrice());
       // Verify if Sum of all Course prices matches with Purchase Amount
       System.out.println("Sum all the course price together");
       int count = jsonPath.getInt("courses.size()");
       for (int i = 0; i < count; i++){

           // multiply price and copies
           int price = jsonPath.get("courses["+i+"].price");
           int copies = jsonPath.get("courses["+i+"].copies");

           int totalPurchase = price * copies;
           System.out.println(totalPurchase);
           sum = sum +totalPurchase;

       }
       System.out.println("Total sum = "+sum);
       int purchase= jsonPath.getInt("dashboard.purchaseAmount");
       Assert.assertEquals(sum,purchase);

   }



}
