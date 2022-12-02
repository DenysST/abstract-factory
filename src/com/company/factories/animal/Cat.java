package com.company.factories.animal;

public class Cat implements Animal{
    @Override
    public void getType() {
        System.out.println("Cat");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
