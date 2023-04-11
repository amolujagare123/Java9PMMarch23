package InheritanceDemo.PolyMorphism;

public class Casting {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        double c = (double) a/b; // casting

        // if you want to store one type of value into another type
        // then use that type in round brackets
        // in front of the value that is to be stored
        // in another type of value.

        System.out.println("c="+c);
    }
}
