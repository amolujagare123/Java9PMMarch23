package IfElse;

public class Triangle {

    public static void main(String[] args) {

        int a = 25;
        int b = 35;
        int c = 40;

        if(a+b+c==180 && a>0 && b>0 && c>0) {

            if (a == b && b == c && a==c)
                System.out.println("Equilateral triangle");

            if (a != b && b != c && c != a)
                System.out.println("Scalene triangle");

            if (a == 90 || b == 90 || c == 90)
                System.out.println("Right angled triangle");

            if ((a == b && b == c && a==c))
                System.out.println("Isosceles triangle");

        }
        else
            System.out.println("this is not a triangle");
    }
}
