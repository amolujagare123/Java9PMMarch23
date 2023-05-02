package Collections.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

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

        System.out.println(al.size());
       // System.out.println(al.get(4));

        System.out.println("------ Using for loop -------");
        for (int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println("------ Using for each loop -------");

        for(String str:al)
        {
            System.out.println(str);
        }

        System.out.println("------ Using Iterator -------");

        Iterator itr  = al.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
