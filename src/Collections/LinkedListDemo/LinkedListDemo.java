package Collections.LinkedListDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("Abhijeet");
        ll.add("Amit");
        ll.add("Bharat");
        ll.add("Darshan");
        ll.add("Neha");
        ll.add("Kirti");
        ll.add("Prabhakara");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

        ll.addFirst("first");
        ll.addLast("last");

        System.out.println(ll);
    }
}
