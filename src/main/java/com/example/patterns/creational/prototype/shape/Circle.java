package com.example.patterns.creational.prototype.shape;

/**
 * @author tuan.nguyen3
 */
public class Circle extends AbstractShape{
    public int radius;

    public Circle() {}

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public AbstractShape clone() {
        return new Circle(this);
    }
}
