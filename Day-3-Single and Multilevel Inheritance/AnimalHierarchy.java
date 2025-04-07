package Inheritance;
// Superclass: Animal
class Animal {
    private String name;
    private int age;
    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getter methods (Encapsulation)
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    // Method to be overridden
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
// Subclass: Dog
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof Woof!");
    }
}
// Subclass: Cat
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " meows: Meow Meow!");
    }
}
// Main Class
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);
        // Demonstrating Polymorphism
        dog.makeSound();
        cat.makeSound();
    }
}
