package com.tcoder.patterns.creational.abstractfactory;

import com.tcoder.patterns.creational.abstractfactory.buttons.IButton;
import com.tcoder.patterns.creational.abstractfactory.checkbox.ICheckbox;

/**
 * @author tuan.nguyen3
 */
public class WindowFactory implements GUIFactory{
    @Override
    public IButton createButton() {
        return null;
    }

    @Override
    public ICheckbox createCheckbox() {
        return null;
    }
}
