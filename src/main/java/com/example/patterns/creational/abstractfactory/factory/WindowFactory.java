package com.example.patterns.creational.abstractfactory.factory;

import com.example.patterns.creational.abstractfactory.buttons.WindowButton;
import com.example.patterns.creational.abstractfactory.checkbox.WindowCheckbox;
import com.example.patterns.creational.abstractfactory.buttons.IButton;
import com.example.patterns.creational.abstractfactory.checkbox.ICheckbox;

/**
 * @author tuan.nguyen3
 */
public class WindowFactory implements GUIFactory {
    @Override
    public IButton createButton() {
        return new WindowButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new WindowCheckbox();
    }
}
