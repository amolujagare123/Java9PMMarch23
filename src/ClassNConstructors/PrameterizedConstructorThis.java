package ClassNConstructors;

public class PrameterizedConstructorThis {

    int a;
    double d;
    char c;
    String str;


    PrameterizedConstructorThis(int a , double d , char c, String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }


    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        PrameterizedConstructorThis ob = new PrameterizedConstructorThis(56,45.56,'h',"nisha");

        ob.display();

    }
}
