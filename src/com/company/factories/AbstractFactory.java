package com.company.factories;

public interface AbstractFactory<T> {
    T create(String type);
}
