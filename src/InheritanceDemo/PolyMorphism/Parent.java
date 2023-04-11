package InheritanceDemo.PolyMorphism;

public class Parent {

    void addition()
    {
        System.out.println("parent Addition");
    }
}

class Child extends Parent{

    // Copy -- void addition()
    void addition()
    {
        System.out.println("child Addition");
    }

    public static void main(String[] args) {
        Child ob = new Child();
        ob.addition();

        Parent p = new Child();  // upcasting
        // object reference of parent class
        // reference variable
        p.addition(); // this will call copy of addition present in child class


        Parent p2 = new Parent();
        p2.addition();
    }
}
