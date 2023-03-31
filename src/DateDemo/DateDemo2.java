package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

    public static void main(String[] args) throws ParseException {

        String str = "03/15/2023"; // MM/dd/yyyy
        System.out.println("Given date in String="+str);
        // convert String into Date
        SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
        Date date = sd.parse(str);
        System.out.println("Converted Date="+date);
    }
}
