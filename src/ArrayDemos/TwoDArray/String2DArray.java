package ArrayDemos.TwoDArray;

public class String2DArray {

    public static void main(String[] args) {

        String[][] allNames = new String[4][3];

        allNames[0][0] = "Akshay";
        allNames[0][1] = "Amrut";
        allNames[0][2] = "Ankush";

        allNames[1][0] = "Arundhati";
        allNames[1][1] = "Avinash R";
        allNames[1][2] = "Dr. Jagrit";

        allNames[2][0] = "Avinash V";
        allNames[2][1] = "Anusha";
        allNames[2][2] = "Latha";

        allNames[3][0] = "Jayanta";
        allNames[3][1] = "Narayanan";
        allNames[3][2] = "Purnasha";

        for (int i=0;i<allNames.length;i++)
        {
            for (int j=0;j<allNames[0].length;j++)
            {
                System.out.print(allNames[i][j]+"\t\t");
            }
            System.out.println();
        }

    }
}
