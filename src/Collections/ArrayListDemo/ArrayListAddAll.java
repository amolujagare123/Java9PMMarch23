package Collections.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListAddAll {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("Abhijeet");
        al.add("Amit");
        al.add("Bharat");
        al.add("Darshan");
        al.add("Neha");
        al.add("Kirti");
        al.add("Prabhakara");
        al.add(true);

        System.out.println("al="+al);

        ArrayList al2 = new ArrayList();

        al2.add(2);
        System.out.println("al2="+al2);

        al2.addAll(al);

        System.out.println("al2="+al2);


    }
}
