package com.company;

import com.company.factories.AbstractFactory;
import com.company.factories.FactoryProvider;
import com.company.factories.FactoryType;
import com.company.factories.animal.Animal;
import com.company.factories.vehicles.Car;
import com.company.factories.vehicles.Vehicle;

public class Main {

    public static void main(String[] args) {
        AbstractFactory<?> abstractFactory;

        abstractFactory = FactoryProvider.getFactory(FactoryType.ANIMAL);
        Animal dog = (Animal) abstractFactory.create("Cat");

        abstractFactory = FactoryProvider.getFactory(FactoryType.VEHICLE);
        Vehicle car = (Vehicle) abstractFactory.create("Truck");

        dog.makeSound();
        car.getType();
    }
}
