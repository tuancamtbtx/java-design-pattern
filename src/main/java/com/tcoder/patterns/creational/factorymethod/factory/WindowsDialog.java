package com.tcoder.patterns.creational.factorymethod.factory;

import com.tcoder.patterns.creational.factorymethod.buttons.Button;
import com.tcoder.patterns.creational.factorymethod.buttons.WindowsButton;

/**
 * @author tuan.nguyen3
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
