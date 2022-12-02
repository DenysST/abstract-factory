package com.company.factories.vehicles;

public class Truck implements Vehicle{
    @Override
    public void getType() {
        System.out.println("Heavy truck");
    }

    @Override
    public void getColour() {
        System.out.println("Yellow");
    }
}
