package com.tcoder.patterns.creational.abstractfactory.factory;

import com.tcoder.patterns.creational.abstractfactory.buttons.IButton;
import com.tcoder.patterns.creational.abstractfactory.checkbox.ICheckbox;

/**
 * @author tuan.nguyen3
 */
public interface GUIFactory {
    IButton createButton();
    ICheckbox createCheckbox();
}
