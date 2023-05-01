package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf2 {

    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList();

        al.add(23);
        al.add(21);
        al.add(11);
        al.add(19);
        al.add(53);
        al.add(26);

        System.out.println(al);

        // 1. remove all odd numbers
        // ( predicate symbol : -> )
        // al.removeIf(variable ->  condition);

      //  al.removeIf(a -> a%2 != 0 );

        // 1. remove all numbers which are greater than 20

        al.removeIf(a -> a>20);


        System.out.println(al);

    }
}
