package com.company.factories.animal;

public class Dog implements Animal{
    @Override
    public void getType() {
        System.out.println("Dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
