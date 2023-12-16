package com.example.patterns.creational.factorymethod.factory;

import com.example.patterns.creational.factorymethod.buttons.Button;
import com.example.patterns.creational.factorymethod.buttons.WindowsButton;

/**
 * @author tuan.nguyen3
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
