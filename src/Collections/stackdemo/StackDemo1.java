package Collections.stackdemo;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push("Abhijeet");
        s.push("Amit");
        s.push("Bharat");
        s.push("Darshan");
        s.push("Neha");
        s.push("Kirti");
        s.push("Prabhakara");

        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        System.out.println(s);
    }
}
