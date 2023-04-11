package InheritanceDemo.PolyMorphism;

public class Addition {
    int a;
    int b;

    void addition()
    {
        int c = 0;
        c = a + b;
        System.out.println("Addition="+c);
    }

    void addition(int a1,int b1)
    {
        int c = 0;
        c = a1 + b1;
        System.out.println("Addition="+c);
    }

    void addition(double a1,double b1)
    {
        double c = 0;
        c = a1 + b1;
        System.out.println("Addition="+c);
    }

    void addition(double a1,double b1,int f)
    {
        double c = 0;
        c = a1 + b1;
        System.out.println("Addition="+c);
    }
    void addition(int a1,int b1,int c1)
    {
        int c = 0;
        c = a1 + b1 + c1;
        System.out.println("Addition="+c);
    }

    void addition(String a1,String b1)
    {
        String c = "";
        c = a1 + b1;
        System.out.println("Addition="+c);
    }


    public static void main(String[] args) {
        Addition ob = new Addition();
        ob.a = 10;
        ob.b =70;
        ob.addition();
        ob.addition(13,45);
        ob.addition(13,45,45);
        ob.addition(13.67,45.90);
        ob.addition("Java-","Selenium");

    }
}
