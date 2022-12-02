package com.company.factories.vehicles;

import com.company.factories.AbstractFactory;

public class VehicleFactory implements AbstractFactory<Vehicle> {
    @Override
    public Vehicle create(String type) {
        switch (type.toLowerCase()) {
            case "car" -> {
                return new Car();
            }
            case "truck" -> {
                return new Truck();
            }
            case "train" -> {
                return new Train();
            }
        }
        throw new RuntimeException("Not valid input value");
    }
}
