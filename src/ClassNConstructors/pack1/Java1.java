package ClassNConstructors.pack1;

public class Java1 {

    public int a;
    public double d;
    private char c;
    String str;

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();
        ob.a = 10 ;
        ob.d = 34.67;
        ob.c = 'g';
        ob.str = "amol";
        ob.display();

    }
}
