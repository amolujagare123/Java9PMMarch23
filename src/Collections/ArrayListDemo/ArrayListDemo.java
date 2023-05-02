package Collections.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

       ArrayList<Character> al = new ArrayList<>();

        /*al.add("amol");
        al.add("rahul");
        al.add("rohit");
        al.add(12);
        al.add(23.78);
        al.add(true);*/
        al.add('c');

        System.out.println(al);
        //System.out.println(al.size());
        System.out.println(al.get(5));
        for (int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
    }
}
