package com.example.patterns.creational.abstractfactory;

import com.example.patterns.creational.abstractfactory.buttons.IButton;
import com.example.patterns.creational.abstractfactory.checkbox.ICheckbox;
import com.example.patterns.creational.abstractfactory.factory.GUIFactory;

/**
 * @author tuan.nguyen3
 */
public class Application {
    private IButton button;
    private ICheckbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
