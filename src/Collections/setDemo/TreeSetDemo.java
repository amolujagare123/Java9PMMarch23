package Collections.setDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> hs = new TreeSet<>();
        hs.add("amol");
        hs.add("ravi");
        hs.add("vipin");
        hs.add("sagar");
        hs.add("nilesh");
        hs.add("nilesh");
        System.out.println(hs);
    }
}
