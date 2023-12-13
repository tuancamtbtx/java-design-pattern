package com.tcoder.patterns.creational.abstractfactory;

import com.tcoder.patterns.creational.abstractfactory.buttons.IButton;
import com.tcoder.patterns.creational.abstractfactory.buttons.MacOsButton;
import com.tcoder.patterns.creational.abstractfactory.checkbox.ICheckbox;
import com.tcoder.patterns.creational.abstractfactory.checkbox.MacOSCheckBox;

/**
 * @author tuan.nguyen3
 */
public class MacOsFactory implements GUIFactory{
    @Override
    public IButton createButton() {
        return new MacOsButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MacOSCheckBox();
    }
}
