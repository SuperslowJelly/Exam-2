package io.github.superslowjelly.exam2.Animals;

public class Fox extends Animal {

    public Fox() {
        super("Fox");
    }

    @Override
    public void speak() {
        System.out.println(super.getName() + " > SCREEE");
    }

}
