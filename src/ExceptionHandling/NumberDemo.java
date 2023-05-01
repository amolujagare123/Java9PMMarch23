package ExceptionHandling;

public class NumberDemo {

    void checkNumber(int i ) throws Exception {
        if (i>=1 && i<=10)
            System.out.println("we are safe");
        else
            throw new Exception("We are in danger");
    }

    public static void main(String[] args) throws Exception {

        int a = 13;
        System.out.println("a="+a);

        NumberDemo ob = new NumberDemo();
        ob.checkNumber(a);

        System.out.println("end of the program");



    }
}
