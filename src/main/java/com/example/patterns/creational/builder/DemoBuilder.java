package com.example.patterns.creational.builder;

import com.example.patterns.creational.builder.cars.Car;
import com.example.patterns.creational.builder.cars.CarBuilder;

/**
 * @author tuan.nguyen3
 */
public class DemoBuilder {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .withMake("make")
                .withModel("model")
                .withColor("color")
                .withDoors(4)
                .withAutomatic(true)
                .build();
        System.out.println(car.model);
    }
}
