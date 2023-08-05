package com.tcoder.patterns.creational.factorymethod.buttons;

/**
 * Factory Method is a creational design pattern that provides an interface for creating objects in a superclass,
 * but allows subclasses to alter the type of objects that will be created.
 * @author tuan.nguyen3
 */
public interface Button {
    void render();
    void onClick();
}
