package Collections.setDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<>();
        hs.add("amol");
        hs.add("ravi");
        hs.add("vipin");
        hs.add("sagar");
        hs.add("nilesh");
        hs.add("nilesh");
        System.out.println(hs);
    }
}
