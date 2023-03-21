package loops;

public class DoWhile {

    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println(i);
            i = i + 1; // i++
        } while (i<=10);

        double a = 23.11;
        // print its multiple of 1,2,3,4,5..

        do {
            System.out.println(a * i);
            i = i + 1;
        } while (i<=10);

    }
}
