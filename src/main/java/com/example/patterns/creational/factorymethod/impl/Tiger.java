package com.example.patterns.creational.factorymethod.impl;

import com.example.patterns.creational.factorymethod.IAnimal;

/**
 * @author tuan.nguyen3
 */
public class Tiger implements IAnimal {
    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }
}
