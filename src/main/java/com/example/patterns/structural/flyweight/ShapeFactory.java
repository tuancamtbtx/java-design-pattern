package com.example.patterns.structural.flyweight;

import java.util.HashMap;

/**
 * @author tuan.nguyen3
 */
public class ShapeFactory {
    public static final HashMap<ShapeType, Shape> shapes = new HashMap<>();

    public static Shape getShape(ShapeType type) {
        Shape shapeImpl = shapes.get(type);
        if (shapeImpl == null) {
            if (type.equals(ShapeType.OVAL_FILL)) {
                shapeImpl = new Oval();
            } else if (type.equals(ShapeType.OVAL_NOFILL)) {
                shapeImpl = new Oval();
            } else if (type.equals(ShapeType.LINE)) {
                shapeImpl = new Line();
            }
            shapes.put(type, shapeImpl);
        }
        return shapeImpl;
    }

    public enum ShapeType {
        OVAL_FILL, OVAL_NOFILL, LINE
    }
}
