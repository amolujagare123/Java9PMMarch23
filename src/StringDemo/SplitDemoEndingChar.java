package StringDemo;

public class SplitDemoEndingChar {


    public static void main(String[] args) {

        String str = "Hey babY you are so lovely";
        String[] stArr = str.split(" ");

        for(int i=0; i< stArr.length;i++) {

           /* String tempStr = stArr[i];
            int l = tempStr.length();

            if( tempStr.charAt(l-1) == 'y' || tempStr.charAt(l-1) == 'Y' )
               System.out.println(stArr[i]);*/

            if (stArr[i].endsWith("y") || stArr[i].endsWith("Y") )
                System.out.println(stArr[i]);
        }

    }
}
