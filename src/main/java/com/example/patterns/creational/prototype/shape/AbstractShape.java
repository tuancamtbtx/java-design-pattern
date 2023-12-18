package com.example.patterns.creational.prototype.shape;

import java.util.Objects;

/**
 * @author tuan.nguyen3
 */
public abstract class AbstractShape {
    public int x;
    public int y;
    public String color;
    public AbstractShape() {}

    public AbstractShape(AbstractShape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }
    public abstract AbstractShape clone();
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof AbstractShape)) return false;
        AbstractShape shape2 = (AbstractShape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
