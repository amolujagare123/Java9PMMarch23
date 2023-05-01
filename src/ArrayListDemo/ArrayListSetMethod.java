package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListSetMethod {

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

        al.set(3,"abcd");

        System.out.println(al);

    }
}
