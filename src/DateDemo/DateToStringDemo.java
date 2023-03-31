package DateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToStringDemo {

    public static void main(String[] args) {

        Date date  = new Date();
        System.out.println(date);


        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        String dateStr = sd.format(date);
        System.out.println(dateStr);



    }
}
