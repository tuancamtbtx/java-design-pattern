package com.tcoder.patterns.creational.factorymethod.factory;

import com.tcoder.patterns.creational.factorymethod.buttons.Button;

/**
 * @author tuan.nguyen3
 */
public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
