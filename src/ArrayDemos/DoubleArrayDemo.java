package ArrayDemos;

public class DoubleArrayDemo {

    public static void main(String[] args) {

        double[] d = new double[5];

        d[0] = 91.2;
        d[1] = 11.89;
        d[2] = 56.11;
        d[3] = 71.52;
        d[4] = 19.82;
        System.out.println("using for each loop");
       // :: --> scope resolute
        for (double i:d) // for each loop
        {
            System.out.println(i);
        }
        System.out.println("using regular for loop");
        for (int i=0;i<d.length;i++)
            System.out.println(d[i]);
    }
}
