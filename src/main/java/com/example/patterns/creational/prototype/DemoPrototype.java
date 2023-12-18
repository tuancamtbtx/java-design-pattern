package com.example.patterns.creational.prototype;

import com.example.patterns.creational.prototype.shape.AbstractShape;
import com.example.patterns.creational.prototype.shape.Circle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tuan.nguyen3
 */
public class DemoPrototype {
    public static void main(String[] args) {
        List<AbstractShape> shapes = new ArrayList<>();
        List<AbstractShape> shapesCopy = new ArrayList<>();
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        Circle anotherCircle = (Circle) circle.clone();
        System.out.println(circle);
        System.out.println(anotherCircle);
    }
}
