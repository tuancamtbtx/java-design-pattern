package com.example.patterns.creational.builder.cars;

/**
 * @author tuan.nguyen3
 */
public class Car {
    public String make;
    public String model;
    public String color;
    public int doors;
    public boolean automatic;

    public Car(CarBuilder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.color = builder.color;
        this.doors = builder.doors;
        this.automatic = builder.automatic;
    }
}
