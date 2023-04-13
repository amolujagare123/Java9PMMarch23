package Methods;

import ClassNConstructors.MyClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodsReturningValues3 {

    int[] getMyArray()
    {
        int[] arr = {56,23,17,89,23,45,67,90};
        return arr;
    }

    String[][] getTwoDArray()
    {
        String[][] stArr = {
                {"Amol","Ankita","Ghanshyam"} ,
                {"Jeeva","Nagayya","Nagma"} ,
                {"Praveen","Satya","Vikash"} ,
                {"Anand","Rajesh","Abhishek"} ,
                {"Rahul","Rohit","vaishali"} ,
        };

        return stArr;
    }

   /* Object[][] getData()
    {

    }*/

    MyClass getLoadedMyClassObject()
    {
        MyClass obj = new MyClass();
        obj.a = 11 ;
        obj.d = 14.67;
        obj.c = 'h';
        obj.str = "ashish";

        return obj;
    }

    public static void main(String[] args) throws ParseException {
        MethodsReturningValues3 ob = new MethodsReturningValues3();

        int[] x = ob.getMyArray();

        for(int y:x)
        {
            System.out.print(y+" ");
        }
        System.out.println("\nThis is the string 2 D array");

        String[][] stringArray = ob.getTwoDArray();

        for (int i=0;i<stringArray.length;i++)
        {
            for (int j=0;j<stringArray[0].length;j++)
            {
                System.out.print(stringArray[i][j]+"\t");
            }
            System.out.println();
        }
        //-----------------------------
        System.out.println("*** 1. We are printing My class Object ....");

        MyClass myClass = ob.getLoadedMyClassObject();
        myClass.display();

        System.out.println("*** 2. We are printing My class Object ....");

        ob.getLoadedMyClassObject().display();


    }
}
