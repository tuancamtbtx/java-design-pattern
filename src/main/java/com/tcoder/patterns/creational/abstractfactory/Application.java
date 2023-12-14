package com.tcoder.patterns.creational.abstractfactory;

import com.tcoder.patterns.creational.abstractfactory.buttons.IButton;
import com.tcoder.patterns.creational.abstractfactory.checkbox.ICheckbox;
import com.tcoder.patterns.creational.abstractfactory.factory.GUIFactory;

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
