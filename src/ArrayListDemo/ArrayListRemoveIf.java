package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Abhijeet");
        al.add("Amit");
        al.add("Bharat");
        al.add("Darshan");
        al.add("Neha");
        al.add("Kirti");
        al.add("Prabhakara");

        System.out.println(al);

        // 1. remove all the elements which starts with 'A'
        // ( predicate symbol : -> )
        // al.removeIf(variable ->  condition);

       // al.removeIf(str ->  str.charAt(0)=='A');

        //System.out.println(al);

        // 2. remove all the elements whose 2nd char is 'a'

     /*   al.removeIf(str ->  str.charAt(1)=='a');
        System.out.println(al);*/

        // 3. remove all the elements whose length is less than or equal to 4

        al.removeIf(str -> str.length() <=4);
        System.out.println(al);





    }
}
