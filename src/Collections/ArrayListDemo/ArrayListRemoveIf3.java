package Collections.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf3 {

    public static void main(String[] args) {


        ArrayList<Character> al = new ArrayList();

        al.add('a');
        al.add('b');
        al.add('c');
        al.add('d');
        al.add('e');
        al.add('f');
        al.add('g');
        al.add('h');
        al.add('i');
        al.add('j');
        al.add('k');
        al.add('l');
        al.add('m');
        al.add('n');
        al.add('o');
        al.add('p');

        System.out.println(al);

        // 1. remove all characters with are vowels a,e,i,o,u
        // ( predicate symbol : -> )
        // al.removeIf(variable ->  condition);

        al.removeIf(c->c=='a' || c=='e'||c=='i'||c=='o'|| c=='u');

        System.out.println(al);



    }
}
