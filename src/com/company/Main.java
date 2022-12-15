package com.company;

import com.company.factories.AbstractFactory;
import com.company.factories.FactoryProvider;
import com.company.factories.FactoryType;
import com.company.factories.animal.Animal;
import com.company.factories.vehicles.Vehicle;

public class Main {

    public static void main(String[] args) {
        AbstractFactory<?> abstractFactory;

        abstractFactory = FactoryProvider.getFactory(FactoryType.ANIMAL);
        Animal animal = (Animal) abstractFactory.create("Dog");

        abstractFactory = FactoryProvider.getFactory(FactoryType.VEHICLE);
        Vehicle vehicle = (Vehicle) abstractFactory.create("Truck");

        animal.makeSound();
        vehicle.getType();
    }
}
