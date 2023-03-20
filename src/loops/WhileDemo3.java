package loops;

import java.util.Scanner;

public class WhileDemo3 {
    public static void main(String[] args) {
        int a=0;
        Scanner sc = new Scanner(System.in);

        while (a!=10) {

            System.out.println("inside while");
            System.out.println("Enter number=");
            a = sc.nextInt(); // 10
        }
    }
}
