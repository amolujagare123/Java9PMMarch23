package Collections.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemoRemove {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        al.add("Abhijeet");
        al.add("Amit");
        al.add("Bharat");
        al.add("Darshan");
        al.add("Neha");
        al.add("Kirti");
        al.add("Prabhakara");

        System.out.println(al);

       /* al.remove(5);

        System.out.println(al);*/

        al.remove("Amit");

        System.out.println(al);


    }
}
