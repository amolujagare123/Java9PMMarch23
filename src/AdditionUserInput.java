import java.util.Scanner;

public class AdditionUserInput {

    public static void main(String[] args) {

        int a ;
        int b ;
        int c ;

        double d;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for a=");
        a = sc.nextInt();

        System.out.println("Enter the value for b=");
        b = sc.nextInt();



        c = a + b ;

        System.out.println( "Addition=" + c);


    }
}
