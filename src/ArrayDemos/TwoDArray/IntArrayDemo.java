package ArrayDemos.TwoDArray;

public class IntArrayDemo {

    public static void main(String[] args) {
        int[][] a = new int[5][3] ;

        a[0][0] =67;
        a[0][1] =77;
        a[0][2] =87;

        a[1][0] =61;
        a[1][1] =72;
        a[1][2] =83;

        a[2][0] =64;
        a[2][1] =75;
        a[2][2] =86;

        a[3][0] =74;
        a[3][1] =85;
        a[3][2] =96;

        a[4][0] =71;
        a[4][1] =82;
        a[4][2] =93;

        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row); // 5
        System.out.println("col="+col); // 3


        for(int i=0;i<5;i++) // rows
        {
            for (int j=0;j<3;j++) // col
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


    }
}
