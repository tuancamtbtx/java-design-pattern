package com.tcoder.patterns.creational.abstractfactory.factory;

import com.tcoder.patterns.creational.abstractfactory.buttons.IButton;
import com.tcoder.patterns.creational.abstractfactory.buttons.MacOsButton;
import com.tcoder.patterns.creational.abstractfactory.checkbox.ICheckbox;
import com.tcoder.patterns.creational.abstractfactory.checkbox.MacOSCheckBox;
import com.tcoder.patterns.creational.abstractfactory.factory.GUIFactory;

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
