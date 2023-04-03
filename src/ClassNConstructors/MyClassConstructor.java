package ClassNConstructors;

public class MyClassConstructor {

    int a;
    double d;
    char c;
    String str;


    MyClassConstructor()
    {
       a = 10;
       d = 23.45;
       c = 'g';
       str = "text";
    }

    /*MyClassConstructor(int a) {
        a= 10;
    }*/

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClassConstructor ob = new MyClassConstructor();
       /* ob.a = 10 ;
        ob.d = 34.67;
        ob.c = 'g';
        ob.str = "amol";*/

        ob.display();

    }
}
