package com.example.patterns.creational.prototype.shape;

/**
 * @author tuan.nguyen3
 */
public class Rectangle extends AbstractShape{
    public int width;
    public int height;
    public Rectangle() {}

    public Rectangle(Rectangle target) {
        super(target);
        if (target!= null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public AbstractShape clone() {
        return new Rectangle(this);
    }
}
