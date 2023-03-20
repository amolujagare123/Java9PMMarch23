package loops;

public class IncrementDecrement1 {

    public static void main(String[] args) {

        int a = 10;

        System.out.println(a); // 10
        System.out.println(a++); // 10
        System.out.println(a); // 11
        System.out.println(++a); // 12
        System.out.println(a); // 12

       /* i++ / i - - : Post operators
        First statement will be executed then increment or decrement happens

        ++i / - -i : Pre operators
        First  increment or decrement happens then statement will be executed
*/

    }
}
