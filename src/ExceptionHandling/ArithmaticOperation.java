package ExceptionHandling;

public class ArithmaticOperation {
    public static void main(String[] args) {

        int a = 10;
        int b = 2;

        int c = 0;

       try {
            c = a / b;
        }
        catch (Exception e)
        {
         /*   System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());*/
            e.printStackTrace();

        }
       finally {
           System.out.println("amol is writing code");
           System.out.println("c="+c);
           System.out.println("End of the program");
       }


    }
}
