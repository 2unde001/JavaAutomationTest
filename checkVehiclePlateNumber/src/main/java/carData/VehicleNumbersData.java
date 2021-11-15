package carData;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VehicleNumbersData
{
    public void patternMatcher(String theRegex, String string2Check)
    {
        Pattern checkRegex = Pattern.compile(theRegex);
        Matcher regexMatcher = checkRegex.matcher(string2Check);

        while (regexMatcher.find())
        {
            if (regexMatcher.group().length() != 0)
            {
                regexMatcher.group();
            }
        }

    }

    private String fileOutPut(String result, String plateNumber) throws FileNotFoundException
    {
        FileReader fileReader = new FileReader("src/main/java/carData/car_output.txt");

        try {
            BufferedReader reader = new BufferedReader(fileReader);
            String vehicleInfo = reader.readLine();

            while (vehicleInfo != null) {
                System.out.println(vehicleInfo);
                vehicleInfo = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find the file");
            System.exit(0);

        } catch (IOException e) {
            System.out.println("I/O occured");
            System.exit(0);
        }
        if (result.contains(plateNumber))
        {

            System.out.println(plateNumber);
        }
        return result;
    }

    public String enterVehiclePlateNumber(String matchPlateNumber,String plateNumber) throws FileNotFoundException
    {
        patternMatcher("\\[A-Za-z\\d,]", fileOutPut(matchPlateNumber, plateNumber));

        return plateNumber;
    }

}
