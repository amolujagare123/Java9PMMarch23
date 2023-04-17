package StaticNFinal;

public class FinalDemo {

    /*final*/ int speed = 100;
    void change()
    {
        speed = 200;
    }

    public static void main(String[] args) {

        FinalDemo ob = new FinalDemo();

        System.out.println("Before change="+ob.speed);
        ob.change();
        System.out.println("After change="+ob.speed);
    }
}
