package com.company.factories.animal;

public class Goat implements Animal{
    @Override
    public void getType() {
        System.out.println("Goat");
    }

    @Override
    public void makeSound() {
        System.out.println("Meeeee");
    }
}
