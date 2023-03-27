package ArrayDemos.TwoDArray;

public class String2DArray2 {

    public static void main(String[] args) {

     /*   String[] s1 = {};
        String[] s2 = {};

        String[][] allNames =  { s1, s2   };*/

        String[][] allNames = {

                {"seema","vanita","sandhya"},
                {"rupin","rama","purnasha"},
                {"nisha","narayanan","latha"},
                {"kalandhar","anusha","jayanta"},

        };


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
