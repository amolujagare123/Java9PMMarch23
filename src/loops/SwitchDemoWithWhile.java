package loops;

import java.util.Scanner;

public class SwitchDemoWithWhile {

    public static void main(String[] args) {

        int a = 50;
        int b = 25 ;
        int c;

        Scanner sc = new Scanner(System.in);
        String operation="";
        do {

            System.out.println("Enter your choice=");
             operation = sc.nextLine();    //"add"; // sub / div / mult

            switch (operation) {
                case "add":
                    c = a + b;
                    System.out.println("Addition=" + c);
                    break;
                case "sub":
                    c = a - b;
                    System.out.println("Subtraction=" + c);
                    break;
                case "div":
                    c = a / b;
                    System.out.println("Division=" + c);
                    break;
                case "mult":
                    c = a * b;
                    System.out.println("Multiplication=" + c);
                    break;
                case "exit":  break;
                default:
                    System.out.println("Wrong choice or option");
                    break;
            }

        } while (!operation.equalsIgnoreCase("exit"));
    }
}
