package ClassNConstructors;

public class MyClass {

    public int a;
    public double d;
    public char c;
    public String str;

    public void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {
      /*  int x;
        x = 10 ;*/

        MyClass ob = new MyClass();
        ob.a = 10 ;
        ob.d = 34.67;
        ob.c = 'g';
        ob.str = "amol";
        ob.display();

        MyClass ob2 = new MyClass();
        ob2.a = 11 ;
        ob2.d = 14.67;
        ob2.c = 'h';
        ob2.str = "ashish";

        ob2.display();

    }
}
