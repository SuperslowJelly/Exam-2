package io.github.superslowjelly.exam2.Animals;

public class Cow extends Animal {

    public Cow() {
        super("Cow");
    }

    @Override
    public void speak() {
        System.out.println(super.getName() + " > MOOOO");
    }

}
