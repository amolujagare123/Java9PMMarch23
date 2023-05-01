package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemove3 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();


        al.add(23);
        al.add(21);
        al.add(33);
        al.add(24);
        al.add(53);
        al.add(26);
        al.add('g');
        al.add(12.34);
        al.add("Amol");
        al.add(true);
        System.out.println(al);

        al.remove(3);

        System.out.println(al);

        al.remove(new Boolean(true));
    }
}
