package Methods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodsReturningValues2 {
    int getMyValue()
    {
        return 10;
    }

    double getMyDoubleValue()
    {
        double d = 34.56;
        return d;
    }

    char getMyChar()
    {
        char ch = 'j';
        return ch;
    }

    boolean getMyResult(int a)
    {
        boolean result;

        if(a>=40)
            result = true;
        else
            result = false;

        return result;
    }

    String getMyString()
    {
        String str = "This is the String";

        return str;
    }

    Date convertStringToDate(String dateStr) throws ParseException {
        // dd/MM/yyyy
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        /*Date date = sd.parse(dateStr);

        return date;*/

        return sd.parse(dateStr);
    }

    void myMethod()
    {
        System.out.println("inside my method");
    }

    public static void main(String[] args) throws ParseException {



        MethodsReturningValues2 ob = new MethodsReturningValues2();
        ob.getMyValue(); // 10

        System.out.println("ob.getMyValue()="+ob.getMyValue());

        int myValue = ob.getMyValue();
        System.out.println("myValue="+myValue);

        if(ob.getMyResult(56))
            System.out.println("I am pass");
        else
            System.out.println("I am fail");


        System.out.println(ob.convertStringToDate("23/10/2022"));
    }
}
