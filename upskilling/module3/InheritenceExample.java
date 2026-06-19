package module3;
class Animal{
    void makeSound(){
        System.out.println("Animal makes different sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("this Barks");
    }
}
public class InheritenceExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.makeSound();
        dog.makeSound();     
    }
}
