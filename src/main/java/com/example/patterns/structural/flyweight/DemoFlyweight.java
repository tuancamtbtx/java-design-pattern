package com.example.patterns.structural.flyweight;

/**
 * @author tuan.nguyen3
 */
public class DemoFlyweight {
    private ShapeFactory.ShapeType getShapeType() {
        return ShapeFactory.ShapeType.LINE;
    }
    public static void main(String[] args) {
        DemoFlyweight demo = new DemoFlyweight();
        ShapeFactory.getShape(demo.getShapeType()).draw();
    }
}
