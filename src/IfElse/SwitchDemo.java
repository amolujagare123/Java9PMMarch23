package IfElse;

public class SwitchDemo {

    public static void main(String[] args) {

        int a = 50;
        int b = 25 ;
        int c;
        String operation = "div1"; // sub / div / mult

        switch (operation)
        {
            case "add" : c = a + b ;
                System.out.println("Addition="+c);
                break;
            case "sub" : c = a - b ;
                System.out.println("Subtraction="+c);
                break;
            case "div" : c = a / b ;
                System.out.println("Division="+c);
                break;
            case "mult" : c = a * b ;
                System.out.println("Multiplication="+c);
                break;
            default:
                System.out.println("Wrong choice or option");
                break;
        }
    }
}
