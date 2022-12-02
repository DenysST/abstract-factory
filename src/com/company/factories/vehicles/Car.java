package com.company.factories.vehicles;

public class Car implements Vehicle{
    @Override
    public void getType() {
        System.out.println("Tesla");
    }

    @Override
    public void getColour() {
        System.out.println("Red");
    }
}
