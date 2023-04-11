package Methods;

import InheritanceDemo.BabyDog;

public class MethodArguments {


    void singleArgumentMethod(int a)
    {
        System.out.println("inside singleArgumentMethod");
        System.out.println("Printing argument="+a);
    }

    void multipleArgumentMethod(int a,int b, int c)
    {
        System.out.println("inside multipleArgumentMethod");
        System.out.println("Printing argument="+a);
        System.out.println("Printing argument="+b);
        System.out.println("Printing argument="+c);
    }

    void differentArgumentMethod(int a,double b, String c)
    {
        System.out.println("inside differentArgumentMethod");
        System.out.println("Printing argument="+a);
        System.out.println("Printing argument="+b);
        System.out.println("Printing argument="+c);
    }

    void primitiveNonPrimitiveMethod(int a,String c)
    {
        System.out.println("inside primitiveNonPrimitiveMethod");
        System.out.println("Printing argument="+a);
        System.out.println("Printing argument="+c);
    }

    void nonPrimitiveMethod(String c)
    {
        System.out.println("inside nonPrimitiveMethod");
        System.out.println("Printing argument="+c);
    }
    void objectAsArgument(BabyDog b)
    {
        System.out.println("inside objectAsArgument");
        b.bark();
        b.weep();
        b.eat();
    }

    void arrayAsArgument(int[] x) {

        for (int y:x ) {
            System.out.println(y);
        }
    }

    void arrayAsArgument(int[][] x) {

        for (int i=0;i<x.length;i++ ) {
            for (int j=0;j<x[0].length;j++) {
                System.out.println(x[i][j]);
            }
        }
    }


    public static void main(String[] args) {

    }
}
