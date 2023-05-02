package Collections.ArrayListDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        Scanner sc = new Scanner(System.in);
        String str ="";
        String ch ="y";
        do {
            System.out.println("Enter the string value:");
            str = sc.nextLine();
            al.add(str);

            System.out.println("Do you want to add more element y / n");
            ch = sc.nextLine();
        }while (!ch.equalsIgnoreCase("n"));

        System.out.println(al);

    }
}
