package ArrayDemos;

public class IntArray {

    public static void main(String[] args) {

        int[] a = new int[5];

        System.out.println("length="+a.length);

        a[0] = 11;
        a[1] = 21;
        a[2] = 14;
        a[3] = 55;
        a[4] = 98;
        System.out.println("length="+a.length);

        /*System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);*/

        for(int i=0;i<5;i++)
            System.out.println(a[i]);


    }
}
