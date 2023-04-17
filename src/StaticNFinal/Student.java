package StaticNFinal;

public class Student {
    int rno;
    String name;
    static String college ="ITC";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.rno = 51;
        s1.name = "Anusha";
        s1.college = "ZEEL";

        s2.rno = 53;
        s2.name = "Narayan";

        s3.rno = 54;
        s3.name = "Pooja";
         s3.college = "PICT";

        Student.college = "Pune College";

        s1.display();
        s2.display();
        s3.display();
    }
}
