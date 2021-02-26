package io.github.superslowjelly.exam2.Animals;

public abstract class Animal {

    public Animal(String name) {
        this.NAME = name;
    }

    private final String NAME;

    public String getName() {
        return NAME;
    }

    public abstract void speak();

}
