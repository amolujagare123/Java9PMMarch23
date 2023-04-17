package StaticNFinal;

public class StudentDemo2 {
    public int rno;
    public String name;
    public static String college ="ITC";

    public void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public void nonstaticMethod()
    {
        System.out.println("nonstaticMethod");

        System.out.println("rno="+rno); // non-static - allowed
        System.out.println("name="+name); // non-static - allowed
        System.out.println("college="+college); // static - allowed

        display(); // non-static - allowed
        staticMethod1() ; //static - allowed
        staticMethod2() ; //static - allowed
    }

    public static void staticMethod1()
    {
        System.out.println("staticMethod1");
       // System.out.println("rno="+rno); // non-static - not allowed
      //  System.out.println("name="+name); // non-static - not allowed
        System.out.println("college="+college); // static - allowed

     //   display(); // non-static - not allowed
        //staticMethod1() ; //static - allowed
        staticMethod2() ; //static - allowed
    }

    public static void staticMethod2()
    {
        System.out.println("staticMethod1");
    }
    public static void main(String[] args) {

        StudentDemo2 ob = new StudentDemo2();

        ob.staticMethod1();
        ob.staticMethod2();

        StudentDemo2.staticMethod1();
        StudentDemo2.staticMethod2();

    }
}
