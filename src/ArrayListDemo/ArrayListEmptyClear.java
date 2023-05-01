package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListEmptyClear {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        System.out.println(al.isEmpty()); // true

        al.add("Abhijeet");
        al.add("Amit");
        al.add("Bharat");
        al.add("Darshan");
        al.add("Neha");
        al.add("Kirti");
        al.add("Prabhakara");

        System.out.println(al.isEmpty()); // false

        System.out.println(al);

        al.clear();

        System.out.println(al);


    }
}
