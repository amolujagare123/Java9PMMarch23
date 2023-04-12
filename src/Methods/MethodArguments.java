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

    //--------------------------------------------------------------
    void objectAsArgument(BabyDog b)
    {
        System.out.println("inside objectAsArgument");
        b.bark();
        b.weep();
        b.eat();
    }

    void arrayAsArgument(int[] x) {
        System.out.println("inside arrayAsArgument");
        for (int y:x ) {
            System.out.println(y);
        }
    }

    void twoDArrayAsArgument(String[][] x) {
        System.out.println("inside twoDArrayAsArgument");
        for (int i=0;i<x.length;i++ ) {
            for (int j=0;j<x[0].length;j++) {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        MethodArguments ob = new MethodArguments();

        ob.singleArgumentMethod(10);
        ob.multipleArgumentMethod(45,12,78);
        ob.differentArgumentMethod(23,56.78,"java");
        ob.primitiveNonPrimitiveMethod('j',"amol");
        ob.nonPrimitiveMethod("this is a string");
//----------------------------------------------------------------------

        ob.objectAsArgument(new BabyDog());

        BabyDog babyDog = new BabyDog();
        ob.objectAsArgument(babyDog);
//----------------------------------------------------------------------

      /*  int[] arr = new int[5];

        arr[0] = 11;
        arr[1] = 56;
        arr[2] = 77;
        arr[3] = 33;
        arr[4] = 65;*/

        int[] arr = {34,56,12,78,12,99,23,45,67,90};
         ob.arrayAsArgument(arr);

//----------------------------------------------------------------------
         String[][] stArr = {

                 {"abc1","pqr1","xyz1"},
                 {"abc2","pqr2","xyz2"},
                 {"abc3","pqr3","xyz3"},
                 {"abc4","pqr4","xyz4"},
         };

         ob.twoDArrayAsArgument(stArr);
    }
}
