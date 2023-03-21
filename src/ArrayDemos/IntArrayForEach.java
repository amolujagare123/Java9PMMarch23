package ArrayDemos;

public class IntArrayForEach {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 11;
        a[1] = 21;
        a[2] = 14;
        a[3] = 55;
        a[4] = 98;

        for (int x : a)  // for each loop
        {
            System.out.println(x);
        }

        System.out.println(a[3]);

    }
}
