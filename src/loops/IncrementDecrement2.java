package loops;

public class IncrementDecrement2 {

    public static void main(String[] args) {

        int a = 10;

        System.out.println(a); // 10
        System.out.println(a--); // 10
        System.out.println(a); // 9
        System.out.println(--a); // 8
        System.out.println(a); // 8

       /* i++ / i - - : Post operators
        First statement will be executed then increment or decrement happens

        ++i / - -i : Pre operators
        First  increment or decrement happens then statement will be executed
*/

    }
}
