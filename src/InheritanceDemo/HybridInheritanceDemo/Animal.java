package InheritanceDemo.HybridInheritanceDemo;

public class Animal {

    void eat()
    {
        System.out.println("eat");
    }
}

class Mammal extends Animal
{
    void walk()
    {
        System.out.println("walk");
    }
}

class Reptile extends Animal
{
    void crawl()
    {
        System.out.println("crawl");
    }
}

class Tiger extends Mammal
{
    void roar()
    {
        System.out.println("roar");
    }
}

class TestInheritance
{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Mammal m = new Mammal();
        m.walk();
        m.eat();

        Reptile r = new Reptile();
        r.crawl();
        r.eat();

        Tiger t = new Tiger();
        t.roar();
        t.walk();
        t.eat();
    }
}