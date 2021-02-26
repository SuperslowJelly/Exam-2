package io.github.superslowjelly.exam2;

import io.github.superslowjelly.exam2.Animals.*;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Fox(),
                new Cow(),
                new Cat()
        };
        for (Animal animal : animals)
            animal.speak();
    }

}
