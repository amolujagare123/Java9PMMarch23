package ArrayDemos.TwoDArray;

public class INtArrayAnotherMethod {

    public static void main(String[] args) {

        int[][] a = {
                {1,1,1,1},
                {2,2,2,2},
                {3,3,3,3},
                {4,4,4,4},
                {5,5,5,5}
        };

        for (int i =0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

      /*  int[][] a1 = {
                {1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4},{5,5,5,5}
        };*/
    }
}
