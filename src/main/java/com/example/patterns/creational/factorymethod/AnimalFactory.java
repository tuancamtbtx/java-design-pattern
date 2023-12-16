package com.example.patterns.creational.factorymethod;

import com.example.patterns.creational.factorymethod.impl.Cat;
import com.example.patterns.creational.factorymethod.impl.Dog;
import com.example.patterns.creational.factorymethod.impl.Tiger;

/**
 * @author tuan.nguyen3
 */
public class AnimalFactory {
    public static enum AnimalType {
        DOG, CAT, TIGER
    }
    public static IAnimal createAnimal(AnimalType animalType) {
        switch (animalType) {
            case DOG:
                return new Dog();
            case CAT:
                return new Cat();
            case TIGER:
                return new Tiger();
            default:
                throw new IllegalArgumentException("Unknown animal type: " + animalType);
        }
    }
}
