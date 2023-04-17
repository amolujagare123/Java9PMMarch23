package AbstractClassNInterface;

public interface InterfaceDemo {

    void run1();
    void start1();

    default void display1()
    {
        System.out.println("display1");
    }
    private void display2()
    {
        System.out.println("display2");
    }
    static void display3()
    {
        System.out.println("display3");
    }
}

class ChildInterface implements InterfaceDemo
{
    public void run1()
    {
        System.out.println("run");
    }
    public void start1()
    {
        System.out.println("run");
    }

    public static void main(String[] args) {

        InterfaceDemo ob = new ChildInterface();
        ob.run1();
        ob.start1();
        ob.display1();

       // ob.display2();

        InterfaceDemo.display3();
    }

}