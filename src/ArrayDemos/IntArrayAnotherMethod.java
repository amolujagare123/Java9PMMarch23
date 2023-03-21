package ArrayDemos;

public class IntArrayAnotherMethod {

    public static void main(String[] args) {

        int[] a = {12,56,1,89,12,45,78,12,89,45,89};

        for (int x:a) {
            System.out.println(x);
        }

        // a.length --> length is the instance variable
        //for(int i=0;i<11;i++)
            for(int i=0;i<a.length;i++)
            {
                System.out.println(a[i]);
             }
    }
}
