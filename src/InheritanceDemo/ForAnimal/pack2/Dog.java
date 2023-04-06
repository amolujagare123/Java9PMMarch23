package InheritanceDemo.ForAnimal.pack2;
import InheritanceDemo.ForAnimal.pack1.Animal;
public class Dog extends Animal {
        public void bark() {
                System.out.println("bark");
        }

        public static void main(String[] args) {

                Dog d = new Dog();
                d.bark();
                d.eat();
        }

}