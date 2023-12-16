package com.example.patterns.creational.abstractfactory.factory;

import com.example.patterns.creational.abstractfactory.buttons.MacOsButton;
import com.example.patterns.creational.abstractfactory.checkbox.MacOSCheckBox;
import com.example.patterns.creational.abstractfactory.buttons.IButton;
import com.example.patterns.creational.abstractfactory.checkbox.ICheckbox;

/**
 * @author tuan.nguyen3
 */
public class MacOsFactory implements GUIFactory {
    @Override
    public IButton createButton() {
        return new MacOsButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MacOSCheckBox();
    }
}
