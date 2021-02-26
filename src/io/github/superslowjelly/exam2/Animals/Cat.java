package io.github.superslowjelly.exam2.Animals;

public class Cat extends Animal {

    public Cat() {
        super("Cat");
    }

    @Override
    public void speak() {
        System.out.println(super.getName() + " > MEOW");
    }

}
