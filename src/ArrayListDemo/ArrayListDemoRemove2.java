package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemoRemove2 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList();

        al.add(23);
        al.add(21);
        al.add(33);
        al.add(24);
        al.add(53);
        al.add(26);


        System.out.println(al);

       /* al.remove(5);

        System.out.println(al);*/

        al.remove(new Integer(53));

        System.out.println(al);



    }
}
