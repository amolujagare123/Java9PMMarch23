package StringDemo;

public class PatternUsingSubString {

    public static void main(String[] args) {

        //String str = "ARUNDHATI";
        String str = "AMOL";

        for (int i=0;i<str.length();i++)
          System.out.println(str.substring(i)+str.substring(0,i));

    }
}
