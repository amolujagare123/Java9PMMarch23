package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveAll {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        al.add("Abhijeet");
        al.add("Amit");
        al.add("Bharat");
        al.add("Darshan");
        al.add("Neha");
        al.add("Kirti");
        al.add("Prabhakara");

        System.out.println("al="+al);

        ArrayList<String> al2 = new ArrayList();

        al2.add("abc1");
        al2.add("abc2");
        al2.add("abc3");
        al2.add("abc4");
        al2.add("abc5");
        al2.add("Bharat");
        al2.add("Darshan");
        al2.add("Neha");


        System.out.println("al2="+al2);

        al2.removeAll(al);

       System.out.println("al2="+al2);


    }
}
