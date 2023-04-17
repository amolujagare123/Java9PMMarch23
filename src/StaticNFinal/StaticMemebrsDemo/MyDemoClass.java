package StaticNFinal.StaticMemebrsDemo;

import StaticNFinal.StudentDemo2;

import static StaticNFinal.StudentDemo2.college;
import static StaticNFinal.StudentDemo2.staticMethod1;
import static StaticNFinal.StudentDemo2.staticMethod2;
public class MyDemoClass {
    public static void main(String[] args) {

        StudentDemo2 ob = new StudentDemo2();

        ob.staticMethod1();
        ob.staticMethod2();
        ob.college = "ITC";


        StudentDemo2.college = "PICT";
        StudentDemo2.staticMethod1();
        StudentDemo2.staticMethod2();

        // we may skip even the class name as well

        college = "PICT";
        staticMethod1();
        staticMethod2();

        // if you statically import the individual member or member function
    }
}
