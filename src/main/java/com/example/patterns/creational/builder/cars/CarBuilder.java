package com.example.patterns.creational.builder.cars;

/**
 * @author tuan.nguyen3
 */
public class CarBuilder {
    public String make;
    public String model;
    public String color;
    public int doors;

    public boolean automatic;

    public CarBuilder withMake(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder withModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder withDoors(int doors) {
        this.doors = doors;
        return this;
    }


    public CarBuilder withAutomatic(boolean automatic) {
        this.automatic = automatic;
        return this;
    }
    public Car build() {
        return new Car(this);
    }
}
