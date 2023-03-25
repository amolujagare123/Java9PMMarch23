package ArrayDemos.TwoDArray;

public class INtArrayAnotherMethod2 {

    public static void main(String[] args) {

        int[][] a = {
                {1,1,1,1},
                {2,2,2,2},
                {3,3,3,3},
                {4,4,4,4},
                {5,5,5,5}
        };

        for (int[] x : a)
        {
            for (int y: x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }


    }
}
