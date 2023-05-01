package ArrayListDemo;

public class ArrayReversal {



    int reverseNumber(int no)
    {


        int revrseno=0,rem;
       // System.out.println("Orignal Number="+no);

        while (no!=0)
        {
            rem=no%10;
            revrseno=revrseno*10+rem;
            no=no/10;
        }
     //   System.out.println("Revrse no="+revrseno);

        return revrseno;

    }
    public static void main(String[] args) {

        int[] a = {123,456,897,123};
        int[] b = new int[4];

        ArrayReversal ob = new ArrayReversal();

        for (int i=0;i<b.length;i++)
        {
            b[i] = ob.reverseNumber(a[i]);
        }

        for (int i=0;i<b.length;i++)
            System.out.println(b[i]);

    }
}
