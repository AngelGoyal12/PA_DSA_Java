abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void sound();
}

class Dog extends Animal {
    private int age;

    Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    void sound() {
        System.out.println(getName() + " says Woof!");
    }
}

class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(getName() + " says Meow!");
    }
}

public class OOPPrinciples {

    public static void main(String[] args) {

        Dog dog = new Dog("Bruno", 3);

        System.out.println("Dog name: " + dog.getName());
        System.out.println("Dog age: " + dog.getAge());

        dog.setAge(4);
        System.out.println("Updated age: " + dog.getAge());

        dog.sound();

        Animal animal = new Cat("Milo");
        System.out.println("Animal name: " + animal.getName());
        animal.sound();
    }
}