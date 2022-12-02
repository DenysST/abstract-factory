package com.company.factories.animal;

import com.company.factories.AbstractFactory;
import com.company.factories.vehicles.Vehicle;

public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(String type) {
        switch (type.toLowerCase()) {
            case "dog" -> {
                return new Dog();
            }
            case "cat" -> {
                return new Cat();
            }
            case "goat" -> {
                return new Goat();
            }
        }
        throw new RuntimeException("Not valid input value");
    }
}
