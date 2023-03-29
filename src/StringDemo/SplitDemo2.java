package StringDemo;

public class SplitDemo2 {


    public static void main(String[] args) {

        String str = "we have to go india tonight";
       String[] stArr = str.split("to");
       // String[] stArr = str.split("i");

        for(int i=0; i< stArr.length;i++) {

            if(i>0)
                System.out.print("to");

            System.out.println(stArr[i]);
        }

    }
}
