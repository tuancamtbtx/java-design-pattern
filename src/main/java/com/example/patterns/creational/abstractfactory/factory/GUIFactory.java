package com.example.patterns.creational.abstractfactory.factory;

import com.example.patterns.creational.abstractfactory.buttons.IButton;
import com.example.patterns.creational.abstractfactory.checkbox.ICheckbox;

/**
 * @author tuan.nguyen3
 */
public interface GUIFactory {
    IButton createButton();
    ICheckbox createCheckbox();
}
