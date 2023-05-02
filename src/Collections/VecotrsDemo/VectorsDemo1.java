package Collections.VecotrsDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorsDemo1 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        System.out.println("size="+v.size()); // 0
        System.out.println("Capacity="+v.capacity()); // 10

        v.add("Abhijeet");
        v.add("Amit");
        v.add("Bharat");
        v.add("Darshan");
        v.add("Neha");
        v.add("Kirti");
        v.add("Prabhakara");
        v.add("Neha");
        v.add("Kirti");
        v.add("Prabhakara");
        v.add("Kirti");
        v.add("Prabhakara");
        v.add("Abhijeet");
        v.add("Amit");
        v.add("Bharat");
        v.add("Darshan");
        v.add("Neha");
        v.add("Kirti");
        v.add("Prabhakara");
        v.add("Neha");




        System.out.println("size="+v.size()); // 24
        System.out.println("Capacity="+v.capacity()); // 40

        System.out.println(v);

        Iterator itr  = v.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());

        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}
