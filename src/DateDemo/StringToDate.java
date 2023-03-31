package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

    public static void main(String[] args) throws ParseException {
        String dateStr0= "23-June-2016" ;
        System.out.println("Given date in String="+dateStr0);
        //→ dd-MMMM-yyyy
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date0 = sd0.parse(dateStr0);
        System.out.println("Converted Date="+date0);

        String dateStr1= "23 | June 16  8:34" ;
        //→ dd | MMMM yy hh:mm
        //→ dd | MMMM yy h:mm
        System.out.println("Given date in String="+dateStr1);
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        Date date1 = sd1.parse(dateStr1);
        System.out.println("Converted Date="+date1);

        String dateStr2= "2016-06-23 | 8:34:23";
        //→ yyyy-MM-dd | hh:mm:ss
        String dateStr3= "Thursday 2016/06/23";
        //→ EEEE yyyy/MM/dd

    }
}
