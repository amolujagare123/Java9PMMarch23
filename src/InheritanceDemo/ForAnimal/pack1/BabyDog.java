package InheritanceDemo.ForAnimal.pack1;

import InheritanceDemo.ForAnimal.pack2.Dog;

public class BabyDog extends Dog {
    void weep() {
        System.out.println("weep");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.bark();
        //d.eat();

        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
       // bd.eat();
    }
}