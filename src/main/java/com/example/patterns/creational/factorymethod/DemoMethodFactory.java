package com.example.patterns.creational.factorymethod;

/**
 * @author tuan.nguyen3
 */
public class DemoMethodFactory {
    public static void main(String[] args) {
       IAnimal animal = AnimalFactory.createAnimal(AnimalFactory.AnimalType.DOG);
        animal.makeSound();
    }
}
