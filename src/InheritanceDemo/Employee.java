package InheritanceDemo;


class Programmer extends Employee
{
    int bonus = 15000;
    void programmerWork()
    {
        System.out.println("programmerWork");
    }


}
public class Employee {
    int salary = 25000;
    void empWork()
    {
        System.out.println("empWork");
    }

    public static void main(String[] args) {

        Programmer p = new Programmer();
        System.out.println("bonus="+p.bonus);
        p.programmerWork();
        System.out.println(p.salary );
        p.empWork();

    }
}




