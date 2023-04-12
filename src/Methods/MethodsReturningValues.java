package Methods;

public class MethodsReturningValues {
    int getMyValue()
    {
        //System.out.println("inside getMyValue");
        return 10;
    }

    void myMethod()
    {
        System.out.println("inside my method");
    }

    public static void main(String[] args) {

        int x;
        x = 123;
        System.out.println(x);
        int y = x;

        int[] a1 = {1,2,3,4,5};
        int[] a2 = a1;

        MethodsReturningValues ob = new MethodsReturningValues();
        ob.getMyValue(); // 10

        System.out.println("ob.getMyValue()="+ob.getMyValue());

        int myValue = ob.getMyValue();
        System.out.println("myValue="+myValue);

        //  System.out.println(ob.myMethod());

    }
}
