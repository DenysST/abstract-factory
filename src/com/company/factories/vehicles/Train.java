package com.company.factories.vehicles;

public class Train implements Vehicle{
    @Override
    public void getType() {
        System.out.println("Speed train");
    }

    @Override
    public void getColour() {
        System.out.println("Black");
    }
}
