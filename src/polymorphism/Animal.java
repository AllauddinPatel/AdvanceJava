
package polymorphism;

public class Animal {

    public void sound(){
        System.out.println("Animal Sound");
    }
}

class Cat extends Animal{

    @Override
    public void sound() {
        System.out.println("Cat Sound");
    }

    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.sound();
    }
}

class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("Dog Sound");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}