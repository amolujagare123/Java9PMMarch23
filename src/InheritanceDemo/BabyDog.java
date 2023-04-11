package InheritanceDemo;

public class BabyDog extends Dog {

    public BabyDog() {

    }

    public void weep() {
        System.out.println("weep");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.bark();
        d.eat();

        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}
