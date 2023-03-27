package StringDemo;

public class PrintSpecificCharacters {

    public static void main(String[] args) {
        String str = "This is a program";
        String strOutput = "";

        for (int i=5;i<=10;i++)
        {
            strOutput = strOutput + str.charAt(i);
          //  System.out.print(str.charAt(i));
        }
        System.out.print(strOutput);
    }
}
