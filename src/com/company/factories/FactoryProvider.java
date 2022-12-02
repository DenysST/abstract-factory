package com.company.factories;

import com.company.factories.animal.AnimalFactory;
import com.company.factories.vehicles.VehicleFactory;

public class FactoryProvider {
    public static AbstractFactory<?> getFactory(FactoryType type) {
        switch (type) {
            case ANIMAL -> {
                return new AnimalFactory();
            }
            case VEHICLE -> {
                return new VehicleFactory();
            }
        }
        throw new RuntimeException("Not valid input type");
    }
}
