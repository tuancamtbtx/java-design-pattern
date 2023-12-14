package com.tcoder.patterns.creational.abstractfactory.factory;

import com.tcoder.patterns.creational.abstractfactory.buttons.IButton;
import com.tcoder.patterns.creational.abstractfactory.buttons.WindowButton;
import com.tcoder.patterns.creational.abstractfactory.checkbox.ICheckbox;
import com.tcoder.patterns.creational.abstractfactory.checkbox.WindowCheckbox;
import com.tcoder.patterns.creational.abstractfactory.factory.GUIFactory;

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
