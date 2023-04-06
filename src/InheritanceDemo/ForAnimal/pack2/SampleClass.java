package InheritanceDemo.ForAnimal.pack2;

import InheritanceDemo.ForAnimal.pack1.Animal;

public class SampleClass extends Dog {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();

        SampleClass s = new SampleClass();
        s.eat();

        Dog d = new Dog();
        d.eat();
    }
}
