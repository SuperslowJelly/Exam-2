package io.github.superslowjelly.exam2.Animals;

public class Dog extends Animal {

    public Dog() {
        super("Dog");
    }

    @Override
    public void speak() {
        System.out.println(super.getName() + " > WOOF");
    }

}
