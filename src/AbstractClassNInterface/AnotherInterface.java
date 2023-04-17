package AbstractClassNInterface;

public interface AnotherInterface {
    void run2();
    void start2();
    void display();

}

interface AnotherInterface2 {
    void display();
}
class ChildInterface1 implements AnotherInterface,AnotherInterface2
{
    public void run2()
    {
        System.out.println("run");
    }
    public void start2()
    {
        System.out.println("run");
    }

    public void display()
    {
        System.out.println("display");
    }
}

